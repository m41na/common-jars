package com.practicaldime.common.model;

import com.practicaldime.common.entity.users.AccRole;
import com.practicaldime.common.entity.users.AccStatus;
import com.practicaldime.common.entity.users.Account;

import java.util.Date;

public class AccountModel implements RequestModel<Account> {

    public Long id;
    public String email;
    public char[] password;
    public String role;
    public String status;
    public Date created;

    public AccountModel() {
        super();
        //default constructor
    }

    public AccountModel(Account entity) {
        this();
        id = entity.getId();
        created = entity.getCreatedTs();
        password = entity.getPassword();
        email = entity.getUsername();
        role = entity.getRole().toString();
        status = entity.getStatus().toString();
    }

    @Override
    public ModelFields validate() {
        ModelFields result = new ModelFields();
        if (email == null || email.trim().length() == 0) {
            result.put("email", email, "email is a required field");
        }

        if (password == null || password.length == 0) {
            result.put("password", password, "password is a required field");
        }
        return result;
    }

    @Override
    public Account entity() {
        Account account = new Account();
        account.setId(id);
        account.setCreatedTs(created);
        account.setPassword(password);
        account.setUsername(email);
        account.setStatus(status != null ? AccStatus.valueOf(status) : AccStatus.unverified);
        account.setRole(role != null ? AccRole.valueOf(role) : AccRole.user);
        return account;
    }
}

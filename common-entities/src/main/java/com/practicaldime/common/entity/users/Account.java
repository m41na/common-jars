package com.practicaldime.common.entity.users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Account {

    private Long id;

    @NotNull(message = "username is a required field")
    @Size(max = 32, message = "max length of username allowed is 32")
    private String username;

    @NotNull(message = "password is a required field")
    @Size(max = 256, message = "max length of password allowed is 256")
    private char[] password;

    @NotNull(message = "account role defaults to 'user' if value is missing")
    private AccRole role = AccRole.guest;

    @NotNull(message = "account status defaults to 'unverified' if value is missing")
    private AccStatus status = AccStatus.unverified;

    private Profile profile;

    @NotNull(message = "updated by is a required field")
    private Long updatedBy;

    private Date createdTs;

    public Account() {
        super();
    }

    public Account(Long id, String username, char[] password, AccRole role, AccStatus status, Profile profile, Long updatedBy, Date createdTs) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
        this.profile = profile;
        this.updatedBy = updatedBy;
        this.createdTs = createdTs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public AccRole getRole() {
        return role;
    }

    public void setRole(AccRole role) {
        this.role = role;
    }

    public AccStatus getStatus() {
        return status;
    }

    public void setStatus(AccStatus status) {
        this.status = status;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(Date createTs) {
        this.createdTs = createTs;
    }
}

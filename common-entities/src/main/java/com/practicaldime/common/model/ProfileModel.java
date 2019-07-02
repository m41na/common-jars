package com.practicaldime.common.model;

import com.practicaldime.common.entity.users.Profile;

import java.util.Date;

public class ProfileModel implements RequestModel<Profile> {

    public String id;
    public String first;
    public String last;
    public String email;
    public Boolean emailOk;
    public String phone;
    public Boolean phoneOK;
    public Date created;
    public String fullName;
    public String error;

    public ProfileModel() {
        super();
    }

    public ProfileModel(Profile entity) {
        id = entity.getId();
        created = entity.getCreatedTs();
        email = entity.getEmailAddress();
        emailOk = entity.getEmailVerified();
        first = entity.getFirstName();
        last = entity.getLastName();
        phone = entity.getPhoneNumber();
        phoneOK = entity.getPhoneVerified();
        fullName = entity.getFullName();
    }

    @Override
    public ModelFields validate() {
        ModelFields result = new ModelFields();
        if (first == null || first.trim().length() == 0) {
            result.put("first", first, "first name is a required field");
        }

        if (last == null || last.trim().length() == 0) {
            result.put("last", last, "last name is a required field");
        }

        if (email == null || email.trim().length() == 0) {
            result.put("email", email, "email address is a required field");
        }

        if (!Validations.validEmail(email)) {
            result.put("email", email, "email address is not a valid format");
        }
        return result;
    }

    @Override
    public Profile entity() {
        Profile profile = new Profile();
        profile.setId(id);
        profile.setCreatedTs(created);
        profile.setEmailAddress(email);
        profile.setEmailVerified(emailOk);
        profile.setFirstName(first);
        profile.setLastName(last);
        profile.setPhoneNumber(phone);
        profile.setPhoneVerified(phoneOK);
        return profile;
    }
}

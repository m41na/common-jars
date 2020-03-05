package com.practicaldime.common.entity.users;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Profile {

    private Long id;

    @Size(max = 32, message = "max length of first name allowed is 32")
    private String firstName;

    @Size(max = 32, message = "max length of last name allowed is 32")
    private String lastName;

    @NotNull(message = "email address is a required field")
    @Size(max = 32, message = "max length of city allowed is 32")
    @Email(message = "expected valid email format", regexp = "^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$")
    private String emailAddress;

    private Boolean emailVerified;

    @Size(max = 16, message = "max length of phone number allowed is 16")
    private String phoneNumber;

    private Boolean phoneVerified;

    private Location locatedAt;

    private Long updatedBy;

    private Date createdTs;

    public Profile() {
        super();
    }

    public Profile(Long id, String firstName, String lastName, String emailAddress, Boolean emailVerified, String phoneNumber, Boolean phoneVerified, Location locatedAt, Long updatedBy, Date createdTs) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.emailVerified = emailVerified;
        this.phoneNumber = phoneNumber;
        this.phoneVerified = phoneVerified;
        this.locatedAt = locatedAt;
        this.updatedBy = updatedBy;
        this.createdTs = createdTs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getPhoneVerified() {
        return phoneVerified;
    }

    public void setPhoneVerified(Boolean phoneVerified) {
        this.phoneVerified = phoneVerified;
    }

    public Location getLocatedAt() {
        return locatedAt;
    }

    public void setLocatedAt(Location locatedAt) {
        this.locatedAt = locatedAt;
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

    public String getFullName() {
        if (getFirstName() != null) {
            if (getLastName() != null) {
                return getFirstName() + " " + getLastName();
            } else {
                return getFirstName();
            }
        } else if (getLastName() != null) {
            return getLastName();
        } else {
            return "Registered User";
        }
    }
}
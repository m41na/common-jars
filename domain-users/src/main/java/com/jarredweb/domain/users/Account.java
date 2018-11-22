package com.jarredweb.domain.users;

public class Account extends BaseEntity {

    private String username;
    private char[] password;
    private AccRole role;
    private AccStatus status;
    private Profile profile;

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
}

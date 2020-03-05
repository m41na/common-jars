package com.practicaldime.common.model;

public class Credentials {

    public char[] email;
    public String username;
    public char[] password;
    public String remember;
    public String authToken;
    public Long id;

    public static Credentials build(String username, String password) {
        Credentials cred = new Credentials();
        cred.username = username;
        cred.password = password.toCharArray();
        return cred;
    }
}

package com.jarredweb.domain.users;

import java.util.Date;

public class LoginStatus {
    
    private Long accountId; 
    private String loginToken;
    private int loginAttempts;
    private String statusInfo;
    private Date lockExpiry;
    private Date loginSuccess; 
    private Date statusCreated;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public Date getLockExpiry() {
        return lockExpiry;
    }

    public void setLockExpiry(Date lockExpiry) {
        this.lockExpiry = lockExpiry;
    }

    public Date getLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(Date loginSuccess) {
        this.loginSuccess = loginSuccess;
    }

    public Date getStatusCreated() {
        return statusCreated;
    }

    public void setStatusCreated(Date statusCreated) {
        this.statusCreated = statusCreated;
    }
}

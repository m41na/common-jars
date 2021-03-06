package com.practicaldime.common.entity.users;

public enum AccStatus {

    active("account is accessible"),
    unverified("account is newly created but is inaccessible pending verification/activation"),
    locked("account user has exceeded login attempts and the account is inaccessible for the duration of the lock out"),
    suspended("account has been rendered inaccessible due to reasons that are under ongoing investigation "),
    disabled("account has been disabled and will need manual intervention to restore its accessibility"),
    deleted("account has been rendered inactive at the user's request and can only be accessible after recovery action");

    private final String details;

    private AccStatus(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}

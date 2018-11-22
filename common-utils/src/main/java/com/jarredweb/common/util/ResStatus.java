package com.jarredweb.common.util;

public class ResStatus {

    private int code;
    private String error;
    private String message;

    public ResStatus() {
        super();
        this.code = 0;
    }

    public ResStatus(int code, String error) {
        this();
        this.code = code;
        this.error = error;
    }

    public ResStatus(int code, String error, String message) {
        this(code, error);
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.practicaldime.common.util;

import java.util.ArrayList;
import java.util.List;

public class ResStatus {

    private final int code;
    private final List<String> errors = new ArrayList<>();
    private final String message;

    public ResStatus(){
        super();
        this.code = 0;
        this.message = "";
    }

    public ResStatus(String message) {
        super();
        this.code = 0;
        this.message = message;
    }

    public ResStatus(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public ResStatus(int code, List<String> errors) {
        super();
        this.code = code;
        this.errors.addAll(errors);
        this.message = "";
    }

    public ResStatus(int code, String message, List<String> errors) {
        super();
        this.code = code;
        this.errors.addAll(errors);
        this.message = message;
    }

    public ResStatus(int code, String message, String error) {
        super();
        this.code = code;
        this.errors.add(error);
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void addError(String error) {
        this.errors.add(error);
    }

    public String getMessage() {
        return message;
    }
}

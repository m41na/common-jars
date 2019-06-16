package com.practicaldime.common.util;

import java.util.Collections;
import java.util.List;

public class AppResult<T> {

    private ResStatus status;
    private T entity;

    public AppResult() {
        this(new ResStatus());
    }

    public AppResult(T entity) {
        this();
        this.entity = entity;
    }

    public AppResult(ResStatus status) {
        super();
        this.status = status;
        this.entity = null;
    }

    public AppResult(int code, String message) {
        this(new ResStatus(code, message));
    }

    public AppResult(int code, String message, String reason) {
        this(new ResStatus(code, message, reason));
    }

    public ResStatus getStatus() {
        return status;
    }

    public void setStatus(ResStatus status) {
        this.status = status;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public int getCode() {
        return status != null ? status.getCode() : 0;
    }

    public List<String> getErrors() {
        return status != null ? status.getErrors() : Collections.emptyList();
    }

    public String getMessage() {
        return status != null ? status.getMessage() : null;
    }
}

package com.practicaldime.common.util;

import java.util.Map;

public class AppException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AppException(int status, String error) {
        super(String.format("error status - %d : %s", status, error));
    }

    public AppException(int status, String error, Throwable cause) {
        super(String.format("error status - %d : %s", status, error, cause));
    }

    public AppException(int status, Map<String, String> errors) {
        super(errors.keySet().stream().reduce(String.format("error status - %d : ", status), (acc, key) -> acc + errors.get(key) + "\n"));
    }

    public AppException(int status, Map<String, String> errors, Throwable cause) {
        super(errors.keySet().stream().reduce(String.format("error status - %d : ", status), (acc, key) -> acc + errors.get(key) + "\n"), cause);
    }
}
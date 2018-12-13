package com.practicaldime.common.util;

public class AppException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private ResStatus errorDetails;

    public AppException(ResStatus appError) {
        super(appError.getMessage());
        this.errorDetails = appError;
    }

    public AppException(ResStatus appError, Throwable cause) {
        super(appError.getMessage(), cause);
        this.errorDetails = appError;
    }

    public ResStatus getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ResStatus errorDetails) {
        this.errorDetails = errorDetails;
    }
}
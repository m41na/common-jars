package com.practicaldime.common.util;

public interface DaoStatus {
    
    int ROW_UPDATED = 200;
    
    int ROW_CREATED = 201;
    
    int OK_NO_CONTENT = 204;
    
    int ROW_NOT_MODIFIED = 304;
    
    int BAD_REQUEST = 400;
    
    int ROW_NOT_FOUND = 404;
    
    int EXPECTATION_FAILED = 417;
    
    int NOT_IMPLEMENTED = 501;
    
    int SERVICE_UNVAILABLE = 503;
}

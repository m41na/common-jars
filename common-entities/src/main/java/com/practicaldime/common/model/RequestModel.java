package com.practicaldime.common.model;

public interface RequestModel<T> {
    
    ModelFields validate();
    
    T entity();
}

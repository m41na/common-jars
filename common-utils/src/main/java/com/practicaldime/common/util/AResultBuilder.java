package com.practicaldime.common.util;

import java.util.HashMap;
import java.util.Map;

public class AResultBuilder {

    private int code = 0;
    private Object data;
    private Map<String, String> errors = new HashMap<>();

    private AResultBuilder(){}

    public static AResultBuilder newResult(){ return new AResultBuilder();};

    public AResultBuilder code (int code){
        this.code = code;
        return this;
    }

    public <T>AResultBuilder data (T data){
        this.data = data;
        return this;
    }

    public AResultBuilder error (String key, String error){
        this.errors.put(key, error);
        return this;
    }

    public AResultBuilder errors (Map<String, String> errors){
        this.errors.putAll(errors);
        return this;
    }

    public AResult build(){
        return data == null? new AResult(errors, code) : (code == 0)? new AResult(data) : new AResult<>(code, data);
    }
}

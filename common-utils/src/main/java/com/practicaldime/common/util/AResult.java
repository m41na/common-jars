package com.practicaldime.common.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AResult<T> {

    public final Integer code;
    public final T data;
    public final Map<String, String> errors;

    public AResult(T data) {
        this.code = 0;
        this.data = data;
        this.errors = Collections.emptyMap();
    }

    public AResult(Integer code, T data) {
        this.code = code;
        this.data = data;
        this.errors = Collections.emptyMap();
    }

    public AResult(Map<String, String> errors, Integer code) {
        this.code = code;
        this.data = null;
        this.errors = errors;
    }

    public AResult(String error, Integer code) {
        this.code = code;
        this.data = null;
        this.errors = new HashMap<String, String>() {{
            put("error", error);
        }};
    }

    public String errorString() {
        return (this.errors == null || this.errors.size() == 0) ? "" :
                this.errors.keySet().stream().reduce("errors: ", (acc, key) -> acc + this.errors.get(key) + "\n");
    }
}

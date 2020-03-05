package com.practicaldime.common.model;

import java.util.HashMap;

public class ModelFields extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public void put(String field, Object value, String error) {
        put(field, new Field(value, error));
    }

    static class Field {

        public Object value;
        public String error;

        public Field(Object value, String error) {
            this.value = value;
            this.error = error;
        }
    }
}

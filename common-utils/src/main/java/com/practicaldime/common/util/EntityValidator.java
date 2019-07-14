package com.practicaldime.common.util;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

public class EntityValidator {

    private final Validator validator;

    public EntityValidator(Validator validator) {
        this.validator = validator;
    }

    public <T> Set<ConstraintViolation<T>> accept(T entity){
        return validator.validate(entity);
    }
}

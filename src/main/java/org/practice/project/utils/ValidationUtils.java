package org.practice.project.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class ValidationUtils {
    private static Logger logger = LoggerFactory.getLogger(ValidationUtils.class);

    public static void validate(Object object) {
        logger.info("Validating object...");
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Object>> violations = validator.validate(object);
        violations.forEach(violation -> {
            String message = violation.getPropertyPath() + ": " + violation.getMessage();
            //System.out.println(message);
            throw new IllegalArgumentException(message);
        });
    }

}

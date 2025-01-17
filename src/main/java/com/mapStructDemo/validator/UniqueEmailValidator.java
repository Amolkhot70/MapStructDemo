package com.mapStructDemo.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {UniqueEmailValidation.class})
public @interface UniqueEmailValidator {

    String message() default "Email is already in use";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
//
//    //Error message
//     String message() default "Invalid Email Address";
//
//    //represents group of constraints
//     Class<?>[] group() default {};
//
//    //represents additional information about annotation
////     Class<? extends Payload>[] Payload() default{};
//    Class<? extends Payload>[] payload() default {};


}



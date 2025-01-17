package com.mapStructDemo.validator;

import com.mapStructDemo.repository.StudentRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueEmailValidation implements ConstraintValidator<UniqueEmailValidator,String> {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public void initialize(UniqueEmailValidator constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String emailId, ConstraintValidatorContext constraintValidatorContext) {
        boolean b = this.studentRepository.findByEmailId(emailId).size() == 0;
        System.out.println("Fetched duplicate Student "+b);
        if(this.studentRepository.findByEmailId(emailId).size()==0)
            return true;
        return false;
    }

}

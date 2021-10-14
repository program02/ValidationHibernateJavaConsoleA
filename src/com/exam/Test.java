/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;


import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author Student
 */
public class Test {

    public static void main(String[] args) {
        Student s = new Student();
        s.setId(100);
        s.setName("aw");
        s.setEmail("ancg");
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Student>> violations = validator.validate(s);
        
        for (ConstraintViolation<Student> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }
}

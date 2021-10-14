/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;





/**
 *
 * @author Student
 */
public class Student {
    @NotNull(message = "Please enter id")
    int id;
    //@Size(max = 20, min = 3, message = "{user.name.invalid} 3 to 20 char")
    @NotEmpty(message = "Please enter name")
    String name;
    @Pattern(regexp = "^[a-zA-Z]{2,3}$", message = "not match")
    String email;

    public Student() {
    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

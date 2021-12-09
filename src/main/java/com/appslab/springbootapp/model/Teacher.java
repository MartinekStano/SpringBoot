package com.appslab.springbootapp.model;

public class Teacher extends Employee{

    public Teacher(float salary, int bonus) {
        super(EnumEmployee.TEACHER, salary, bonus);
    }
}

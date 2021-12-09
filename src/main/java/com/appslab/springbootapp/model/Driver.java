package com.appslab.springbootapp.model;

public class Driver extends Employee {
    public Driver(float salary, int bonus)
    {
        super(EnumEmployee.DRIVER,salary, bonus);
    }
}

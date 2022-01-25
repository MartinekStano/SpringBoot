package com.appslab.springbootapp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Driver extends Employee {

//    public Driver(float salary, int bonus)
//    {
//        super(EnumEmployee.DRIVER,salary, bonus);
//    }
}

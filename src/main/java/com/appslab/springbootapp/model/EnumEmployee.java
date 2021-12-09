package com.appslab.springbootapp.model;

public enum EnumEmployee {
    TEACHER("Teacher"), PROGRAMMER("Programmer"), DRIVER("Driver");

    String name;
    EnumEmployee(String name){
        this.name=name;
    }
}

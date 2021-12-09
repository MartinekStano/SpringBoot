package com.appslab.springbootapp;

import org.springframework.stereotype.Component;

@Component
public class OtherClass {
    private EmployeeService employeeService;
    private EmployeeServiceImpl employeeServiceImpl;

    public OtherClass(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeService = employeeServiceImpl;
        employeeServiceImpl.writeNum();
    }
}

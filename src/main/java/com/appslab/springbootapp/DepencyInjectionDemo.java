package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Employee;
import com.appslab.springbootapp.model.Programmer;
import com.appslab.springbootapp.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DepencyInjectionDemo {
    private EmployeeServiceImpl employeeServiceImpl;
    private EmployeeService employeeService;

    public DepencyInjectionDemo(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
        employeeServiceImpl.writeNum();
    }

    List<Employee> employeeList = Arrays.asList(new Programmer(2100, 400), new Teacher(1600, 200));


}

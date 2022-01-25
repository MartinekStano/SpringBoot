package com.appslab.springbootapp.employee;

import com.appslab.springbootapp.employee.EmployeeService;
import com.appslab.springbootapp.employee.EmployeeServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class OtherClass {
    private EmployeeService employeeService;
    private EmployeeServiceImpl employeeServiceImpl;

//    public OtherClass(EmployeeServiceImpl employeeServiceImpl) {
//        this.employeeService = employeeServiceImpl;
//        employeeServiceImpl.writeNumber();
//    }
}

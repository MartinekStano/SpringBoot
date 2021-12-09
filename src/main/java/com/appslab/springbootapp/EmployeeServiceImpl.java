package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private int number;

    public void totalSalary(List<Employee> employeeList)
    {
        System.out.println(employeeList.stream().mapToDouble(Employee::getSalary));
    }
    public void totalBonus(List<Employee> employeeList)
    {
        System.out.println(employeeList.stream().mapToInt(Employee::getBonus));
    }

    public void writeNum(){
        number = number + 1;
        System.out.println(number);
    }
}

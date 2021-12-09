package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Employee;
import com.appslab.springbootapp.model.Programmer;
import com.appslab.springbootapp.model.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    private EmployeeService employeeService;
    List<Employee> employeeList = Arrays.asList(new Programmer(2100, 400), new Teacher(1600, 200));

    @GetMapping
    public String helloWorld(){
        return "Hello World!";
    }

  @RequestMapping(path="/salary")
   public double getSalary(){
        return employeeService.totalSalary(employeeList);
   }

  @RequestMapping(path="/bonus")
   public int getBonus(){
  return employeeService.totalBonus(employeeList);
  }

  double height = 0.2;
    double lenght = 0.4;
    double total = 100;
    @RequestMapping(path = "/snail")
  public double getTotalDistance(){
        return employeeService.totalDistance(height, lenght, total);
  }




}

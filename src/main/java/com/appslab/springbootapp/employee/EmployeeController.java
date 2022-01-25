package com.appslab.springbootapp.employee;

import com.appslab.springbootapp.model.Employee;
import com.appslab.springbootapp.model.Programmer;
import com.appslab.springbootapp.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService service;



    public EmployeeController(@Autowired EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employee")
            public void createEmployees(@RequestBody List<Employee> employees){
        for(Employee employee : employees){
            service.saveEm(employee);
        }
    }

//    List<Employee> employeeList = Arrays.asList(new Programmer(2100, 400), new Teacher(1600, 200));
//
//    @GetMapping
//    public String helloWorld(){
//        return "Hello World!";
//    }
//
//  @GetMapping(path="/salary")
//   public double getSalary(){
//        return service.totalSalary(employeeList);
//   }
//
//  @GetMapping(path="/bonus")
//   public int getBonus(){
//  return service.totalBonus(employeeList);
//  }
//
//
//  @GetMapping(path = "/snail")
//  public double getTotalDistance(@RequestParam(value = "height", defaultValue = "0.2") double height, @RequestParam(value = "length", defaultValue = "0.2") double length, @RequestParam(value = "total", defaultValue = "100") double total){
//        return service.totalDistance(height, length, total);
//  }

}

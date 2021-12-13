package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Employee;
import com.appslab.springbootapp.model.Programmer;
import com.appslab.springbootapp.model.Teacher;
import org.springframework.web.bind.annotation.*;

import javax.management.ConstructorParameters;
import javax.websocket.server.PathParam;
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

  @GetMapping(path="/salary")
   public double getSalary(){
        return employeeService.totalSalary(employeeList);
   }

  @GetMapping(path="/bonus")
   public int getBonus(){
  return employeeService.totalBonus(employeeList);
  }


  @GetMapping(path = "/snail")
  public double getTotalDistance(@RequestParam(value = "height", defaultValue = "0.2") double height, @RequestParam(value = "length", defaultValue = "0.2") double length, @RequestParam(value = "total", defaultValue = "100") double total){
        return employeeService.totalDistance(height, length, total);
  }

}

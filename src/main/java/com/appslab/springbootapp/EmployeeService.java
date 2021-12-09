package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
   double totalSalary(List<Employee> list);
   int totalBonus(List<Employee> list);
   void writeNumber();
   double totalDistance(double height, double length, double total);
}

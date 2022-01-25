package com.appslab.springbootapp.employee;

import com.appslab.springbootapp.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}

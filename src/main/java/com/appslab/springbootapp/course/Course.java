package com.appslab.springbootapp.course;

import com.appslab.springbootapp.model.Employee;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.Set;

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private Date starTime;
    private Date endTime;

    @ManyToMany(mappedBy = "course")
    private Set<Employee> employee;
}

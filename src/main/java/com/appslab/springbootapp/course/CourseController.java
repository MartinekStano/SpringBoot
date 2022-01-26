package com.appslab.springbootapp.course;

import com.appslab.springbootapp.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CourseController {
    private final ICourseService courseService;
    private final EmployeeService employeeService;

    public CourseController(@Autowired ICourseService courseService, EmployeeService employeeService) {
        this.courseService = courseService;
        this.employeeService = employeeService;
    }
    @GetMapping("course/new")
    public void createCourse(@RequestBody Course course){
        courseService.saveCourse(course);
    }
}

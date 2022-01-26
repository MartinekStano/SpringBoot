package com.appslab.springbootapp.course;

import java.util.Optional;

public class CourseServiceImpl implements ICourseService{

private final ICourseRepository repository;

    public CourseServiceImpl(ICourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveCourse(Course course) {
        repository.save(course);
    }

}

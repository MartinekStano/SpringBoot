package com.appslab.springbootapp.course;

import org.springframework.data.repository.CrudRepository;

public interface ICourseRepository extends CrudRepository<Course, Integer> {
}

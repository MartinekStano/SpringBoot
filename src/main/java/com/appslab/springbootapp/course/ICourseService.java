package com.appslab.springbootapp.course;

import ch.qos.logback.core.CoreConstants;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

public interface ICourseService{
    void saveCourse(Course course);
}

package com.aniabasno.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;
    
    public List<Course> getAllCourses() {
        if (courseRepository == null) {
            throw new IllegalStateException("CourseRepository is not initialized");
        }
        return courseRepository.findAll();
    }
}

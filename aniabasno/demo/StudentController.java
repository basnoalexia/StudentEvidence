package com.aniabasno.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    private final StudentService studentService;
    
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    // Constrain id to digits only so that "/students/search" doesn't match here
    @GetMapping("/students/{id:\\d+}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.findStudentById(id);
    }
    
    // GET /students/search?name=value - search students by name
    @GetMapping("/students/search")
    public List<Student> searchStudentsByName(@RequestParam String name) {
        return studentService.findStudentsByName(name);
    }
}
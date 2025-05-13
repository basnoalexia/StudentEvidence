package com.aniabasno.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public Student findStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }
    
    public List<Student> findStudentsByName(String name) {
        // Search by first or last name
        return studentRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(name, name);
    }
}
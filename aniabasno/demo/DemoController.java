package com.aniabasno.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

@Autowired
private final CourseService courseService;


public DemoController(CourseService courseService) {
    this.courseService = courseService;
}

@GetMapping("/")
public String index() {
        return "Index of the demo application!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the demo application! Service: " + courseService.toString();
    }
 
   
}
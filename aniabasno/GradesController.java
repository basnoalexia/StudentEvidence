package com.aniabasno;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniabasno.demo.GradesEnrollmentDTO;

@RestController
public class GradesController {

    private final GradesService gradesService;

    public GradesController(GradesService gradesService) {
        this.gradesService = gradesService;
    }

    @GetMapping("/grades-with-enrollment")
    public List<GradesEnrollmentDTO> getGradesWithEnrollmentData() {
        return gradesService.getGradesWithEnrollmentData();
    }
}
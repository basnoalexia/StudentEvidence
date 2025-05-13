package com.aniabasno;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aniabasno.demo.GradesEnrollmentDTO;  // Correct import

@Service
public class GradesService {

    private final GradesRepository gradesRepository;

    public GradesService(GradesRepository gradesRepository) {
        this.gradesRepository = gradesRepository;
    }

    public List<GradesEnrollmentDTO> getGradesWithEnrollmentData() {
        return gradesRepository.findGradesWithEnrollmentData();
    }
}
package com.aniabasno;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AttendenceService {
    private final AttendenceRepository attendenceRepository;

    public AttendenceService(AttendenceRepository attendenceRepository) {
        this.attendenceRepository = attendenceRepository;
    }

    public Attendence createAttendence(Attendence attendence) {
        return attendenceRepository.save(attendence);
    }

    public Attendence updateAttendence(int id, Attendence attendence) {
        return attendenceRepository.findById(id).map(existing -> {
            existing.setEnrollmentId(attendence.getEnrollmentId());
            existing.setDate(attendence.getDate());
            existing.setStatus(attendence.getStatus());
            return attendenceRepository.save(existing);
        }).orElse(null);
    }

    public void deleteAttendence(int id) {
        attendenceRepository.deleteById(id);
    }
    
    public List<Attendence> getAllAttendences() {
        return attendenceRepository.findAll();
    }
}
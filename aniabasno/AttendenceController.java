package com.aniabasno;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendenceController {
    private final AttendenceService attendenceService;

    public AttendenceController(AttendenceService attendenceService) {
        this.attendenceService = attendenceService;
    }

    // GET all attendance records
    @GetMapping("/attendences")
    public List<Attendence> getAllAttendences() {
        return attendenceService.getAllAttendences();
    }

    // POST to create a new attendance record
    @PostMapping("/attendences")
    public Attendence createAttendence(@RequestBody Attendence attendence) {
        return attendenceService.createAttendence(attendence);
    }

    // PUT to update an existing attendance record
    @PutMapping("/attendences/{id}")
    public Attendence updateAttendence(@PathVariable int id, @RequestBody Attendence attendence) {
        return attendenceService.updateAttendence(id, attendence);
    }

    // DELETE to remove an attendance record by id
    @DeleteMapping("/attendences/{id}")
    public void deleteAttendence(@PathVariable int id) {
        attendenceService.deleteAttendence(id);
    }
}
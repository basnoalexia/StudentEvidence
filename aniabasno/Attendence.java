
package com.aniabasno;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "studentevidence", name = "attedences")
public class Attendence {
    @Id
    @Column(name = "attendence_id")
    private int attendanceId;

    @Column(name = "enrollment_id")
    private int enrollmentId;

    @Column(name = "date")
    private Date date;

    @Column(name = "status")
    private String status;

    public Attendence() {
    }

    public Attendence(int attendanceId, int enrollmentId, Date date, String status) {
        this.attendanceId = attendanceId;
        this.enrollmentId = enrollmentId;
        this.date = date;
        this.status = status;
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
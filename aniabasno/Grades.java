package com.aniabasno;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "studentevidence", name = "grades")
public class Grades {
    @Id
    @Column(name = "grade_id")
    private int gradeId;

    @Column(name = "enrollment_id")
    private int enrollmentId;

    @Column(name = "grade")
    private int grade;

    @Column(name = "grade_date")
    private Date gradeDate;

    public Grades() {
    }

    public Grades(int gradeId, int enrollmentId, int grade, Date gradeDate) {
        this.gradeId = gradeId;
        this.enrollmentId = enrollmentId;
        this.grade = grade;
        this.gradeDate = gradeDate;
    }

    public int getGradeId() {
        return gradeId;
    }
    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }
    public int getEnrollmentId() {
        return enrollmentId;
    }
    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public Date getGradeDate() {
        return gradeDate;
    }
    public void setGradeDate(Date gradeDate) {
        this.gradeDate = gradeDate;
    }
}




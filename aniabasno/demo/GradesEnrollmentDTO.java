package com.aniabasno.demo;

import java.util.Date;

public class GradesEnrollmentDTO {
    private int gradeId;
    private int enrollmentId;
    private int grade;
    private Date enrollmentDate;

    public GradesEnrollmentDTO(int gradeId, int enrollmentId, int grade, Date enrollmentDate) {
        this.gradeId = gradeId;
        this.enrollmentId = enrollmentId;
        this.grade = grade;
        this.enrollmentDate = enrollmentDate;
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
    public Date getEnrollmentDate() {
        return enrollmentDate;
    }
    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}

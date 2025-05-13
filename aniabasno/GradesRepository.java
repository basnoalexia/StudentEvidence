package com.aniabasno;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aniabasno.demo.GradesEnrollmentDTO;

@Repository
public interface GradesRepository extends JpaRepository<Grades, Integer> {

    @Query("SELECT new com.aniabasno.demo.GradesEnrollmentDTO(g.gradeId, e.enrollmentId, g.grade, e.enrollmentDate) " +
           "FROM Grades g JOIN Enrollment e ON g.enrollmentId = e.enrollmentId")
    List<GradesEnrollmentDTO> findGradesWithEnrollmentData();
}
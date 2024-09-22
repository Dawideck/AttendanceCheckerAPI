package com.AttendanceChecker.AttendanceCheckerAPI.repositories;

import com.AttendanceChecker.AttendanceCheckerAPI.dataClasses.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

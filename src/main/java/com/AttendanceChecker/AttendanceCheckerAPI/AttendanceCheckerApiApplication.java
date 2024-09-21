package com.AttendanceChecker.AttendanceCheckerAPI;

import com.AttendanceChecker.AttendanceCheckerAPI.dataClasses.Attendance;
import com.AttendanceChecker.AttendanceCheckerAPI.dataClasses.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendanceCheckerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendanceCheckerApiApplication.class, args);

    }
}

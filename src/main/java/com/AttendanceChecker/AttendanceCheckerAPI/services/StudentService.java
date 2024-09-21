package com.AttendanceChecker.AttendanceCheckerAPI.services;

import com.AttendanceChecker.AttendanceCheckerAPI.dataClasses.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student findStudentById(int id){
        return null;
    }

    public int getNextIdForStudent(int lastHighestId){
        return ++lastHighestId;
    }

}

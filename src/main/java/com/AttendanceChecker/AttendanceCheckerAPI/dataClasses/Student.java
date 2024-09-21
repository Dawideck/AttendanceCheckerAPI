package com.AttendanceChecker.AttendanceCheckerAPI.dataClasses;


import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@Getter
public class Student extends Person {
    private final List<Attendance> attendanceList;
    private final int studentId;

    public Student(int studentId, List<Attendance> attendance, String name, String lastName) {
        super(name, lastName);
        this.studentId = studentId;
        this.attendanceList = attendance;
    }
}
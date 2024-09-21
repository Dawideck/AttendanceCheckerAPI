package com.AttendanceChecker.AttendanceCheckerAPI.dataClasses;

import lombok.Getter;
import lombok.ToString;
import java.util.List;

@Getter
@ToString
public class Teacher extends Person{
    private final int teacherId;
    private final List<ClassesTaught> classesTaught;

    public Teacher(int teacherId, List<ClassesTaught> classesTaught, String name, String lastName){
        super(name, lastName);
        this.teacherId = teacherId;
        this.classesTaught = classesTaught;
    }
}

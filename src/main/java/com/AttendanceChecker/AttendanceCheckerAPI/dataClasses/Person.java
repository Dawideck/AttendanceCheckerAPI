package com.AttendanceChecker.AttendanceCheckerAPI.dataClasses;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
public class Person {
    private final String name;
    private final String lastName;
    @Setter
    private boolean isActive;
    @Setter
    private String dateRegistered;

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

}

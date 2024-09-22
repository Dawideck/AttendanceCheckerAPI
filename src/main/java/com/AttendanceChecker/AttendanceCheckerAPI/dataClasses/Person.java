package com.AttendanceChecker.AttendanceCheckerAPI.dataClasses;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@MappedSuperclass
public class Person {
    private String name;
    private String lastName;
    @Column(columnDefinition = "BOOLEAN DEFAULT false")
    private boolean isActive;
    private String dateRegistered;

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public Person(){}


}

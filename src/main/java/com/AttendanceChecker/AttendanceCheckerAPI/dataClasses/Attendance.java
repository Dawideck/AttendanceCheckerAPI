package com.AttendanceChecker.AttendanceCheckerAPI.dataClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Attendance(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) int id, String date, String time, String classCode) {
}
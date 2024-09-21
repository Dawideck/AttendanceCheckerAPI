package com.AttendanceChecker.AttendanceCheckerAPI.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CreateStudentRequestDTO {
    @NotNull
    private int studentId;
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;


}

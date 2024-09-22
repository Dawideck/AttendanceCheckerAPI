package com.AttendanceChecker.AttendanceCheckerAPI.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CreateStudentRequestDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;


}

package com.AttendanceChecker.AttendanceCheckerAPI.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStudentRequestDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;

}

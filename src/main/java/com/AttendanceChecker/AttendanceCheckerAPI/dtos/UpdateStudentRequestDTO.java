package com.AttendanceChecker.AttendanceCheckerAPI.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStudentRequestDTO {
    @NotBlank(message = "The name cannot be null!")
    private String name;
    @NotBlank(message = "The lastName cannot be null!")
    private String lastName;
    @NotNull(message = "The isActive cannot be null!")
    private boolean isActive;

}

package com.AttendanceChecker.AttendanceCheckerAPI.controllers;
import com.AttendanceChecker.AttendanceCheckerAPI.dataClasses.Attendance;
import com.AttendanceChecker.AttendanceCheckerAPI.dataClasses.Student;
import com.AttendanceChecker.AttendanceCheckerAPI.dtos.CreateStudentRequestDTO;
import com.AttendanceChecker.AttendanceCheckerAPI.dtos.UpdateStudentRequestDTO;
import com.AttendanceChecker.AttendanceCheckerAPI.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> students = new ArrayList<>();

    public StudentController(){
        students.add(new Student(1337, new ArrayList<>(), "foo", "bar"));
        students.add(new Student(1338, new ArrayList<>(), "foo2", "bar2"));
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return students;
    }

    @PostMapping("/students")
    public ResponseEntity<Object> createNewStudent(@RequestBody @Valid CreateStudentRequestDTO studentDTO){
        int randomStudentId = generateStudentId();

        Student newStudent = new Student(
                randomStudentId,
                new ArrayList<>(),
                studentDTO.getName(),
                studentDTO.getLastName()
        );

        students.add(newStudent);
        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
    }

    // TODO extract to a service
    public int generateStudentId(){
        Random random = new Random();
        return random.nextInt(9999) + 1;
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Object> updateStudent(@PathVariable int id, @RequestBody @Valid UpdateStudentRequestDTO updateStudentDTO){
        StudentService studentService = new StudentService();
        Student existingStudent = studentService.findStudentById(id);

        return ResponseEntity.ok(existingStudent);
    }


}
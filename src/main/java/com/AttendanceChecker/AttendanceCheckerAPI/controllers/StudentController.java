package com.AttendanceChecker.AttendanceCheckerAPI.controllers;
import com.AttendanceChecker.AttendanceCheckerAPI.dataClasses.Student;
import com.AttendanceChecker.AttendanceCheckerAPI.dtos.CreateStudentRequestDTO;
import com.AttendanceChecker.AttendanceCheckerAPI.dtos.UpdateStudentRequestDTO;
import com.AttendanceChecker.AttendanceCheckerAPI.repositories.StudentRepository;
import com.AttendanceChecker.AttendanceCheckerAPI.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService studentService;
    private final StudentRepository studentRepository;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public ResponseEntity<Object> createNewStudent(@RequestBody @Valid CreateStudentRequestDTO studentDTO) {

        Student newStudent = new Student(
                new ArrayList<>(),
                studentDTO.getName(),
                studentDTO.getLastName()
        );

        studentService.createStudent(newStudent);
        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
    }

    // TODO extract to a service. However, this will be obsolete anyways ????
    public int generateStudentId(){
        Random random = new Random();
        return random.nextInt(9999) + 1;
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Object> updateStudent(@PathVariable long id, @RequestBody @Valid UpdateStudentRequestDTO updateStudentDTO) {
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();

            existingStudent.setName(updateStudentDTO.getName());
            existingStudent.setLastName(updateStudentDTO.getLastName());
            existingStudent.setActive(updateStudentDTO.isActive());
            studentRepository.save(existingStudent);
            return ResponseEntity.ok(existingStudent);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with id: " + id + " has not been found!");
        }
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Object> removeStudent(@PathVariable Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            studentRepository.deleteById(id);

            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(optionalStudent);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with id: " + id + " has not been found!");
    }

}
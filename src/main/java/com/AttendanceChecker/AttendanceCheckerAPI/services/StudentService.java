package com.AttendanceChecker.AttendanceCheckerAPI.services;

import com.AttendanceChecker.AttendanceCheckerAPI.dataClasses.Student;
import com.AttendanceChecker.AttendanceCheckerAPI.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentById(Long id){
        System.out.printf(id.toString());
        Optional<Student> studentInDB = studentRepository.findById(id);
        System.out.printf("studentInDBservice"+ studentInDB.toString());


        return studentInDB;
    }
}

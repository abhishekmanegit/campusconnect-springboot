package com.campusconnect.controller;

import com.campusconnect.dto.StudentDTO;
import com.campusconnect.model.Student;
import com.campusconnect.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentDTO createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}

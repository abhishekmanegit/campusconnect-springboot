package com.campusconnect.service;

import com.campusconnect.dto.StudentDTO;
import com.campusconnect.model.Student;
import com.campusconnect.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDTO createStudent(Student student) {
        Student saved = studentRepository.save(student);
        return new StudentDTO(
                saved.getId(),
                saved.getName(),
                saved.getEmail()
        );
    }
}

package com.campusconnect.service;

import com.campusconnect.dto.EventDTO;
import com.campusconnect.exception.ResourceNotFoundException;
import com.campusconnect.model.Event;
import com.campusconnect.model.Student;
import com.campusconnect.repository.EventRepository;
import com.campusconnect.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final StudentRepository studentRepository;

    public EventService(EventRepository eventRepository,
                        StudentRepository studentRepository) {
        this.eventRepository = eventRepository;
        this.studentRepository = studentRepository;
    }

    public EventDTO createEvent(Event event) {
        Event saved = eventRepository.save(event);
        return new EventDTO(
                saved.getId(),
                saved.getTitle(),
                saved.getDescription()
        );
    }

    public Event registerStudent(Long eventId, Long studentId) {
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        event.getStudents().add(student);
        student.getEvents().add(event);

        studentRepository.save(student);
        return eventRepository.save(event);
    }
}

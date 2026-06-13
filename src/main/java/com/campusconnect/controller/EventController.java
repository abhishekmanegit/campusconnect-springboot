package com.campusconnect.controller;

import com.campusconnect.dto.EventDTO;
import com.campusconnect.model.Event;
import com.campusconnect.service.EventService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public EventDTO createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @PostMapping("/{eventId}/register/{studentId}")
    public Event registerStudent(@PathVariable Long eventId,
                                 @PathVariable Long studentId) {
        return eventService.registerStudent(eventId, studentId);
    }
}

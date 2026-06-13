package com.campusconnect.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "student_event",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private Set<Event> events = new HashSet<>();

    public Student() {}

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Set<Event> getEvents() { return events; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}

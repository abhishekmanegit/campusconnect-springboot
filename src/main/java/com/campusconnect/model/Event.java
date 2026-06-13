package com.campusconnect.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToMany(mappedBy = "events")
    private Set<Student> students = new HashSet<>();

    public Event() {}

    public Event(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Set<Student> getStudents() { return students; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
}

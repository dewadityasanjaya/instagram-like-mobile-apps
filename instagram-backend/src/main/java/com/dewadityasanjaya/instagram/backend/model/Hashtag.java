package com.dewadityasanjaya.instagram.backend.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Hashtags")
public class Hashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hashtagId;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "hashtags")
    private Set<Post> posts;

    // Getters and setters
}


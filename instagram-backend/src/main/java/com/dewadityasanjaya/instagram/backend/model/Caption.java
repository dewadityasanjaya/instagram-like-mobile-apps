package com.dewadityasanjaya.instagram.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Captions")
public class Caption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer captionId;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @Column(nullable = false)
    private String text;

    // Getters and setters
}


package com.dewadityasanjaya.instagram.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PostHashtags")
@IdClass(PostHashtagId.class)
public class PostHashtag {

    @Id
    private Integer postId;

    @Id
    private Integer hashtagId;

    @ManyToOne
    @JoinColumn(name = "post_id", insertable = false, updatable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "hashtag_id", insertable = false, updatable = false)
    private Hashtag hashtag;

    // Getters and setters
}


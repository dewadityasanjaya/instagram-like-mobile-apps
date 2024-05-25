package com.dewadityasanjaya.instagram.backend.service;

import com.dewadityasanjaya.instagram.backend.model.Post;
import com.dewadityasanjaya.instagram.backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> getExplorePosts() {
        // Add logic for explore posts
        return postRepository.findAll(); // Simplified
    }
}


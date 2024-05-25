package com.dewadityasanjaya.instagram.backend.service;

import com.dewadityasanjaya.instagram.backend.model.Comment;
import com.dewadityasanjaya.instagram.backend.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getCommentsByPostId(Integer postId) {
        return commentRepository.findByPostId(postId);
    }

    public Comment createComment(Comment comment) {
        // Add any additional logic here, e.g., validation
        return commentRepository.save(comment);
    }
}


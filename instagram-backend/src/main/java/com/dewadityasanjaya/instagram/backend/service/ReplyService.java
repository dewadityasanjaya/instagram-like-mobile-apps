package com.dewadityasanjaya.instagram.backend.service;

import com.dewadityasanjaya.instagram.backend.model.Reply;
import com.dewadityasanjaya.instagram.backend.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {
    @Autowired
    private ReplyRepository replyRepository;

    public List<Reply> getRepliesByCommentId(Integer commentId) {
        return replyRepository.findByCommentId(commentId);
    }

    public Reply createReply(Reply reply) {
        // Add any additional logic here, e.g., validation
        return replyRepository.save(reply);
    }
}


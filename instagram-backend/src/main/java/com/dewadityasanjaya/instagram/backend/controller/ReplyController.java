package com.dewadityasanjaya.instagram.backend.controller;

import com.dewadityasanjaya.instagram.backend.model.Reply;
import com.dewadityasanjaya.instagram.backend.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/replies")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @GetMapping("/comment/{commentId}")
    public List<Reply> getRepliesByCommentId(@PathVariable Integer commentId) {
        return replyService.getRepliesByCommentId(commentId);
    }

    @PostMapping
    public Reply createReply(@RequestBody Reply reply) {
        return replyService.createReply(reply);
    }
}


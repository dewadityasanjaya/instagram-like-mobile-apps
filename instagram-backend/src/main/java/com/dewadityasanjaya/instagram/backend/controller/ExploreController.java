package com.dewadityasanjaya.instagram.backend.controller;

import com.dewadityasanjaya.instagram.backend.model.Post;
import com.dewadityasanjaya.instagram.backend.model.Story;
import com.dewadityasanjaya.instagram.backend.service.PostService;
import com.dewadityasanjaya.instagram.backend.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/explore")
public class ExploreController {
    @Autowired
    private PostService postService;

    @Autowired
    private StoryService storyService;

    @GetMapping("/posts")
    public List<Post> explorePosts() {
        return postService.getExplorePosts();
    }

    @GetMapping("/stories")
    public List<Story> exploreStories() {
        return storyService.getExploreStories();
    }
}


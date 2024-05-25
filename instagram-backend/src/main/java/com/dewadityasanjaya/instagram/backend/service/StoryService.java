package com.dewadityasanjaya.instagram.backend.service;

import com.dewadityasanjaya.instagram.backend.model.Story;
import com.dewadityasanjaya.instagram.backend.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {
    @Autowired
    private StoryRepository storyRepository;

    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }

    public Story createStory(Story story) {
        return storyRepository.save(story);
    }

    public List<Story> getExploreStories() {
        // Add logic for explore stories
        return storyRepository.findAll(); // Simplified
    }
}


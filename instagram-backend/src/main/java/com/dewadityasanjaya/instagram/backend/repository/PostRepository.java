package com.dewadityasanjaya.instagram.backend.repository;

import com.dewadityasanjaya.instagram.backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}


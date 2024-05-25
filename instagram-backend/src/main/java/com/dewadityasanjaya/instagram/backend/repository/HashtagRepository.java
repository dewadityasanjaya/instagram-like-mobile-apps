package com.dewadityasanjaya.instagram.backend.repository;

import com.dewadityasanjaya.instagram.backend.model.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashtagRepository extends JpaRepository<Hashtag, Integer> {
}

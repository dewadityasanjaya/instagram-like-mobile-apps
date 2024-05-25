package com.dewadityasanjaya.instagram.backend.repository;

import com.dewadityasanjaya.instagram.backend.model.PostHashtag;
import com.dewadityasanjaya.instagram.backend.model.PostHashtagId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostHashtagRepository extends JpaRepository<PostHashtag, PostHashtagId> {
}


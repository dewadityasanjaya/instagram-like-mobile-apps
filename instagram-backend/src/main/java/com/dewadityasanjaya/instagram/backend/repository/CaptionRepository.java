package com.dewadityasanjaya.instagram.backend.repository;

import com.dewadityasanjaya.instagram.backend.model.Caption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaptionRepository extends JpaRepository<Caption, Integer> {
}


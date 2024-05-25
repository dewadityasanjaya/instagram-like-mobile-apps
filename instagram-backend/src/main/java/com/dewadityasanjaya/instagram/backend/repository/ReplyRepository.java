package com.dewadityasanjaya.instagram.backend.repository;

import com.dewadityasanjaya.instagram.backend.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Integer> {
	List<Reply> findByCommentId(Integer commentId);
}


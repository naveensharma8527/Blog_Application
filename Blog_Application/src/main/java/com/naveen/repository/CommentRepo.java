package com.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}

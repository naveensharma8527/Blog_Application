package com.naveen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Category;
import com.naveen.entity.Post;
import com.naveen.entity.User;

public interface PostRepo  extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);

}

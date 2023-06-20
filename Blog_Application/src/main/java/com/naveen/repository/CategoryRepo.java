package com.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}

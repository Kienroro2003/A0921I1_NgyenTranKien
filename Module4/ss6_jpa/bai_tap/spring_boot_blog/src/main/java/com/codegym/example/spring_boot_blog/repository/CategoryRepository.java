package com.codegym.example.spring_boot_blog.repository;

import com.codegym.example.spring_boot_blog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

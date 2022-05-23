package com.codegym.example.spring_boot_blog.repository;

import com.codegym.example.spring_boot_blog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}

package com.codegym.blog_spring_super.service;

import com.codegym.blog_spring_super.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    void create(Blog blog);
    Blog findById(int id);
    Page<Blog> getAllBlog( String sortField, String sortDir, Pageable pageable);
    void delete(int id);
    void update(Blog blog);
}

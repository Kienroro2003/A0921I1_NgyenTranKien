package com.codegym.example.spring_boot_blog.service;

import com.codegym.example.spring_boot_blog.entity.Blog;

import java.util.List;

public interface BlogService {
    void create(Blog blog);
    void update(Blog blog);
    List<Blog> findAll();
    Blog findById(int id);
    void remove(int id);
}

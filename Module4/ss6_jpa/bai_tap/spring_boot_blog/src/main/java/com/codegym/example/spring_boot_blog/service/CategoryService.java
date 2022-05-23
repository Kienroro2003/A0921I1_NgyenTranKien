package com.codegym.example.spring_boot_blog.service;

import com.codegym.example.spring_boot_blog.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
}

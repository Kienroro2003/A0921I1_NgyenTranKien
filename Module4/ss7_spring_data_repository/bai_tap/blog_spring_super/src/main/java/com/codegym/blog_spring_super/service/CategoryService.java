package com.codegym.blog_spring_super.service;

import com.codegym.blog_spring_super.entity.Category;

import java.util.List;

public interface CategoryService {
    void create(Category category);
    Category findById(int id);
    List<Category> findAll();
    void delete(int id);
    void update(Category category);
}

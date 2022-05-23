package com.codegym.example.spring_boot_blog.service;

import com.codegym.example.spring_boot_blog.entity.Blog;
import com.codegym.example.spring_boot_blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public void create(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        List<Blog> blogs = new ArrayList<>();
        blogRepository.findAll().forEach(b -> blogs.add(b));
        return blogs;
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
        Blog blog = findById(id);
        if(blog != null){
            blogRepository.delete(blog);
        }
    }
}

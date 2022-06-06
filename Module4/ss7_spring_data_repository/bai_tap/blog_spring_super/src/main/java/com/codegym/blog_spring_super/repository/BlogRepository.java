package com.codegym.blog_spring_super.repository;

import com.codegym.blog_spring_super.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog where author like concat('%',:author,'%') and category like concat('%',:category_id,'%') ",
            nativeQuery = true,
    countQuery = "select count(*) from ( select * from blog where author like concat('%',:author,'%') and category like concat('%',:category_id,'%'))abc")
    Page<Blog> findAll(@Param("author")String author, @Param("category_id")String id, Pageable pageable);
}

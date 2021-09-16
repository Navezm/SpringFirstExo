package com.example.exospring.services;

import com.example.exospring.entities.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();

    Article findById(Long id);

    List<Article> findByAuthor(Long id);
}

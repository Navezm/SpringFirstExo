package com.example.exospring.services;

import com.example.exospring.entities.Article;
import com.example.exospring.entities.Person;
import com.example.exospring.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{
    ArticleRepository repository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.repository = articleRepository;
    }

    @Override
    public List<Article> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Article findById(Long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public List<Article> findByAuthor(Long id){
        return this.repository.findByAuthor(id);
    }

}

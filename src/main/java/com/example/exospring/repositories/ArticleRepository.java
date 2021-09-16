package com.example.exospring.repositories;

import com.example.exospring.entities.Article;
import com.example.exospring.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query(value = "SELECT a FROM Article a JOIN a.author aa WHERE aa.id = :id")
    List<Article> findByAuthor(@Param(value = "id") Long id);

}

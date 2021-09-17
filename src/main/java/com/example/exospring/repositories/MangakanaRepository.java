package com.example.exospring.repositories;

import com.example.exospring.entities.Manga;
import com.example.exospring.entities.Mangakana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MangakanaRepository extends JpaRepository<Mangakana, Long> {
    List<Mangakana> findAllByMangasIsContaining(Manga manga);
}

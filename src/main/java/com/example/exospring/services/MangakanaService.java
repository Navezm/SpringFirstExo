package com.example.exospring.services;

import com.example.exospring.entities.Manga;
import com.example.exospring.entities.Mangakana;

import java.util.List;

public interface MangakanaService {
    List<Mangakana> findAll();
    List<Mangakana> findAllByManga(Manga manga);
}

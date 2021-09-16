package com.example.exospring.services;

import com.example.exospring.entities.Manga;

import java.util.List;

public interface MangaService {
    List<Manga> findAll();
}

package com.example.exospring.services;

import com.example.exospring.entities.Manga;
import com.example.exospring.repositories.MangaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangaServiceImpl implements MangaService{
    private MangaRepository repository;

    public MangaServiceImpl(MangaRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Manga> findAll() {
        return repository.findAll();
    }
}


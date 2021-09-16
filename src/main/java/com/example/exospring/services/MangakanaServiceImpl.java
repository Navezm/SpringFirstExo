package com.example.exospring.services;

import com.example.exospring.entities.Mangakana;
import com.example.exospring.repositories.MangakanaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangakanaServiceImpl implements MangakanaService{
    private MangakanaRepository repository;

    public MangakanaServiceImpl(MangakanaRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Mangakana> findAll() {
        return repository.findAll();
    }
}

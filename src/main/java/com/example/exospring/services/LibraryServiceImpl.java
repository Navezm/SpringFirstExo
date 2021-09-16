package com.example.exospring.services;

import com.example.exospring.entities.Library;
import com.example.exospring.repositories.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService{
    private final LibraryRepository repository;

    public LibraryServiceImpl(LibraryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Library> findAll() {
        return repository.findAll();
    }

    @Override
    public Library insert(Library library) {
        return repository.save(library);
    }
}

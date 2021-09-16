package com.example.exospring.services;

import com.example.exospring.entities.Library;

import java.util.List;

public interface LibraryService {
    List<Library> findAll();
    Library insert(Library library);
}

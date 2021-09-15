package com.example.exospring.services;

import com.example.exospring.entities.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person findById(Long id);
}

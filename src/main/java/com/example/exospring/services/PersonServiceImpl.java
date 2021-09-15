package com.example.exospring.services;

import com.example.exospring.entities.Person;
import com.example.exospring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    private PersonRepository repository;

    @Autowired
    public PersonServiceImpl(PersonRepository repository){ this.repository = repository; }

    @Override
    public List<Person> findAll() {
        return repository.findAll();
    }

    @Override
    public Person findById(Long id) {
        return repository.findById(id).get();
    }
}

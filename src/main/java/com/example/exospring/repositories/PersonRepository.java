package com.example.exospring.repositories;

import com.example.exospring.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Override
    List<Person> findAll();

    List<Person> findByName(String name);

}

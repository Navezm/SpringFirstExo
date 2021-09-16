package com.example.exospring.repositories;

import com.example.exospring.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Override
    List<Person> findAll();

    @Query(value = "SELECT p FROM Person p WHERE p.name = :str")
    Person findByName(@Param(value = "str") String name);

}

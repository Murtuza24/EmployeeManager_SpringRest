package com.example.springdemo.dao;

import com.example.springdemo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPersonToDB(UUID id, Person person);

    default int insertPersonToDB(Person person){
        UUID id = UUID.randomUUID();
        return insertPersonToDB(id, person);
    }

    List<Person> getAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id);
}

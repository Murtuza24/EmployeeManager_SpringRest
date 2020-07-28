package com.example.springdemo.dao;

import com.example.springdemo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("personDAO")
public class PersonDataAccessService implements PersonDao {

    List<Person> DB = new ArrayList<>();

    @Override
    public int insertPersonToDB(UUID id, Person person) {
        System.out.println("PersonDaoAccessService: " + person.getName());
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> getAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(person -> person.getUuid().equals(id))
                .findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id) {
        return 0;
    }
}

package com.example.springdemo.service;

import com.example.springdemo.dao.PersonDao;
import com.example.springdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("personDAO") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        System.out.println("PersonService: " + person.getName());
        return personDao.insertPersonToDB(person);
    }

    public List<Person> getAllEmployees() {
        return personDao.getAllPeople();
    }
}

package com.example.springdemo.api;

import com.example.springdemo.model.Person;
import com.example.springdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/EmployeeApp/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("addEmployee")
    @PostMapping
    public  void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @RequestMapping("getEmployees")
    @GetMapping
    public List<Person> getEmployees(){
        return personService.getAllEmployees();
    }
}


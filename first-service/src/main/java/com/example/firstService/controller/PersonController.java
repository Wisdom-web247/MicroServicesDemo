package com.example.firstService.controller;

import com.example.firstService.models.Person;
import com.example.firstService.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@CrossOrigin("http://localhost")
@RestController
@RequestMapping(value = "/api/person")
public class PersonController {

    private final PersonService personService;

    //DependencyInjection = ConstructorInjection
    //Injects the Sevice file into the controller
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(value = "allPersons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping(value = "personById/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping(value = "/newPerson")
    public String addPerson(@RequestBody Person person) {
        personService.addPerson(person);
        return "Person added successfully";
    }

    @PutMapping(value = "/existingPerson/{id}")
    public String updatePerson(@PathVariable Long id, @RequestBody Person person) {
        personService.updatePerson(id, person);
        return "Person updated successfully";
    }

    @DeleteMapping(value = "/deletePerson/{id}")
    public String deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return "Person deleted successfully";
    }

}

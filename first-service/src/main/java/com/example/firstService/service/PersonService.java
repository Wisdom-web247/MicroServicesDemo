package com.example.firstService.service;

import com.example.firstService.models.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();

    Person getPersonById(Long id);

    void addPerson(Person person);

    void updatePerson(Long id, Person person);

    void deletePerson(Long id);
}

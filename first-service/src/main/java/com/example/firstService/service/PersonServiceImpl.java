package com.example.firstService.service;

import com.example.firstService.models.Person;
import com.example.firstService.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    //Creating an instance
    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public void updatePerson(Long id, Person person) {

        Person existingPerson = personRepository.findById(id).orElse(null);
        existingPerson.setFirstName(person.getFirstName());
        existingPerson.setLastName(person.getLastName());
        existingPerson.setAge(person.getAge());
        existingPerson.setEmail(person.getEmail());
        personRepository.save(existingPerson);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}

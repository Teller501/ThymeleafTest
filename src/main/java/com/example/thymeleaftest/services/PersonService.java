package com.example.thymeleaftest.services;

import com.example.thymeleaftest.model.Person;
import com.example.thymeleaftest.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> getPersons(){
        return personRepository.getPersons();
    }
}

package com.example.thymeleaftest.repositories;

import com.example.thymeleaftest.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepository {

    public List<Person> getPersons(){
        return new ArrayList<>(Arrays.asList(
                new Person("Anders",18),
                new Person("Mathias", 12),
                new Person("Omar",23)
        ));
    }
}

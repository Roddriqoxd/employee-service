package com.devcode.employee_service.service;

import com.devcode.employee_service.domain.Person;
import com.devcode.employee_service.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Person findAccount(String email, String password) {
        return personRepository.findByEmailAndPassword(email,password);
    }

}

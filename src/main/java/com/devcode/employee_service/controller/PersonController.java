package com.devcode.employee_service.controller;

import com.devcode.employee_service.domain.Person;
import com.devcode.employee_service.repository.PersonRepository;
import com.devcode.employee_service.service.EmployeeService;
import com.devcode.employee_service.service.PersonService;
import com.devcode.employee_service.usecase.PersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PersonUseCase personUseCase;

    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    public Person createBasicEmployee(@RequestBody Person person) {
        return personUseCase.createUser(person);
    }

    @GetMapping("/login")
    public Person login(@RequestBody Person person) {
        return personService.findAccount(person.getEmail(), person.getPassword());
    }
}

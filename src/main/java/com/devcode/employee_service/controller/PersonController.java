package com.devcode.employee_service.controller;

import com.devcode.employee_service.domain.Person;
import com.devcode.employee_service.service.EmployeeService;
import com.devcode.employee_service.usecase.PersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PersonUseCase personUseCase;

    @PostMapping("/create")
    public Person createBasicEmployee(@RequestBody Person person) {
        return personUseCase.createUser(person);
    }



}

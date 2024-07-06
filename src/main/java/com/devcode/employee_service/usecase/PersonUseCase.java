package com.devcode.employee_service.usecase;

import com.devcode.employee_service.domain.Employee;
import com.devcode.employee_service.domain.Person;
import com.devcode.employee_service.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonUseCase {

    private PersonRepository personRepository;

    public Person createUser(Person person){
        Person newPerson = new Person();

        newPerson.setFirstName(person.getFirstName());
        newPerson.setLastName(person.getLastName());
        newPerson.setNumber(person.getNumber());
        newPerson.setEmployee(createNewEmployee());

        return newPerson;

    }

    private Employee createNewEmployee(){
        Employee employee = new Employee();

        employee.setUsedTime(0L);
        employee.setPosition("Developer");
        employee.setDateAdmission(new Date());
        employee.setFreeTime(30L);
        employee.setIsSupervisor(false);
        employee.setSupervisorId(null);

        return  employee;
    }
}

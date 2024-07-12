package com.devcode.employee_service.usecase;

import com.devcode.employee_service.domain.Employee;
import com.devcode.employee_service.domain.Person;
import com.devcode.employee_service.domain.enums.UserType;
import com.devcode.employee_service.repository.EmployeeRepository;
import com.devcode.employee_service.repository.PersonRepository;
import com.devcode.employee_service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonUseCase {
    @Autowired
    private PersonService personService;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private EmployeeRepository employeeRepository;


    public Person createUser(Person person) {
        Employee employee = createNewEmployee();
        Person newPerson = new Person();

        newPerson.setFirstName(person.getFirstName());
        newPerson.setLastName(person.getLastName());
        newPerson.setNumber(person.getNumber());
        newPerson.setRole(person.getRole());
        newPerson.setEmail(person.getEmail());
        newPerson.setPassword(person.getPassword());
        newPerson.setEmployee(employee);

        return personService.createPerson(newPerson);
    }

    private Employee createNewEmployee() {
        Employee employee = new Employee();

        employee.setUsedTime(0L);
        employee.setUserType(UserType.EMPLOYEE);
        employee.setDateAdmission(new Date());
        employee.setFreeTime(30L);
        employee.setIsSupervisor(false);
        employee.setSupervisorId(null);

        return employeeRepository.save(employee);
    }
}

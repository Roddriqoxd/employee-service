package com.devcode.employee_service.repository;

import com.devcode.employee_service.domain.Person;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.function.Function;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {


    Person findByEmailAndPassword (String email, String password);

}

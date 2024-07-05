package com.devcode.employee_service.service;

import com.devcode.employee_service.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    Employee findById(Long id);

    void deleteById(Long id);

    Employee saveEmployee(Employee employee);

    Employee update(Employee employee);


}

package com.devcode.employee_service.controller;

import com.devcode.employee_service.domain.Employee;
import com.devcode.employee_service.dto.EmployeeDto;
import com.devcode.employee_service.service.EmployeeService;
import com.devcode.employee_service.usecase.FindByIdUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private FindByIdUseCase findByIdUseCase;

    @PostMapping("/crate")
    private Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/find/{id}")
    private EmployeeDto getEmployeeInformation(@PathVariable Long id) {
        return findByIdUseCase.findById(id);
    }
}

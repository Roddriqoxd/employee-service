package com.devcode.employee_service.usecase;

import com.devcode.employee_service.domain.Employee;
import com.devcode.employee_service.dto.EmployeeDto;
import com.devcode.employee_service.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindByIdUseCase {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeDto findById(Long id){
        Employee employee = employeeService.findById(id);
        return modelMapper.map(employee, EmployeeDto.class);
    }
}

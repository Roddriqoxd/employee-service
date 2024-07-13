package com.devcode.employee_service.usecase;

import com.devcode.employee_service.domain.Employee;
import com.devcode.employee_service.dto.EmployeeDto;
import com.devcode.employee_service.mapper.EmployeeMapper;
import com.devcode.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindByIdUseCase {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeDto findById(Long id){
        Employee employee = employeeService.findById(id);
        EmployeeDto employeeDto = EmployeeMapper.INSTANCE.employeeDtos(employee);
        return employeeDto;
    }
}

package com.devcode.employee_service.mapper;

import com.devcode.employee_service.domain.Employee;
import com.devcode.employee_service.dto.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(target = "userType",source = "user")
    EmployeeDto employeeDto(Employee employee);
}

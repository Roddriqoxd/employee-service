package com.devcode.employee_service.dto;

import com.devcode.employee_service.domain.Employee;
import com.devcode.employee_service.domain.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {

    private Long id;

    private String user;

    private Long usedTime;

    private Long freeTime;

    private Long supervisorId;

    public EmployeeDto() {

    }
}

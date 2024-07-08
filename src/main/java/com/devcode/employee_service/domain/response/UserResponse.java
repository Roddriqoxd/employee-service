package com.devcode.employee_service.domain.response;

import com.devcode.employee_service.domain.Employee;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserResponse {

    private Long id;
    private String email;
    private String password;
    private String role;
    private Boolean isFirstLogin;
    private Date loginIn;
    private Date LoginOut;
    private String userType;
    private Employee employee;

}

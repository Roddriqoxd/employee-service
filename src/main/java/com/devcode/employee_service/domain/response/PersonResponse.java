package com.devcode.employee_service.domain.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private Long number;
}

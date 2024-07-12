package com.devcode.employee_service.domain;

import com.devcode.employee_service.domain.enums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dateAdmission;

    private UserType userType;

    private Boolean isSupervisor;

    private Long usedTime;

    private Long freeTime;

    private Long supervisorId;

    public Employee() {

    }
}

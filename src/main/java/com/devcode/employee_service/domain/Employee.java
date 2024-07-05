package com.devcode.employee_service.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dateAdmission;

    private String position;
    private Boolean isSupervisor;
    private Long usedTime;
    private Long freeTime;
    private Long supervisorId;
}

package com.devcode.employee_service.domain;

import com.devcode.employee_service.domain.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private Role role;

    @Column(name = "is_first_login")
    private Boolean isFirstLogin;

    @Temporal(TemporalType.TIMESTAMP)
    private Date loginIn;

    @Temporal(TemporalType.TIMESTAMP)
    private Date LoginOut;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false)
    private Employee employee;
}

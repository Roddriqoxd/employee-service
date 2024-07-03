package com.devcode.employee_service.repository;

import com.devcode.employee_service.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package com.example.React_spr.repository;

import com.example.React_spr.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//@Component
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}

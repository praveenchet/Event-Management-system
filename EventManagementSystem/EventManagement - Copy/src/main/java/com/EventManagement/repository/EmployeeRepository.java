package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventManagement.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}

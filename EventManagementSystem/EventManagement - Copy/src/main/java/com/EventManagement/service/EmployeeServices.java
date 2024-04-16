package com.EventManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EventManagement.Entities.Employee;

@Component
public interface EmployeeServices 
{
	Employee  addEmployee(Employee  employee );
	
	List<Employee > getAllEmployee();
	
	Employee  getEmployeeById(Long empId);
	
	Employee updateEmployee(Long empId , Employee  employee );
	
	void deleteEmployeeById(Long empId );
	
	void deleteAllEmployee();
	
	boolean isEmployeeExists(Long empId);
}

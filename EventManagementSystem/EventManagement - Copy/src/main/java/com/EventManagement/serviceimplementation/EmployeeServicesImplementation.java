package com.EventManagement.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.Employee;
import com.EventManagement.repository.EmployeeRepository;
import com.EventManagement.service.EmployeeServices;

@Service
public class EmployeeServicesImplementation implements EmployeeServices
{
	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) 
	{
		
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee()
	{
		
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long empId)
	{
		
		return employeeRepo.findById(empId).get();
	}

	@Override
	public Employee updateEmployee(Long empId, Employee employee)
	{
		Employee e = employeeRepo.findById(empId).get();
		e.setContactDetails(employee.getContactDetails());
		e.setDob(employee.getDob());
		e.setEmail(employee.getEmail());
		e.setManager(employee.getManager());
		e.setName(employee.getName());
		e.setWageRate(employee.getWageRate());
		e.setWageType(employee.getWageType());
		return employeeRepo.save(e);
	}

	@Override
	public void deleteEmployeeById(Long empId)
	{
		employeeRepo.findById(empId);
		
	}

	@Override
	public void deleteAllEmployee()
	{
		employeeRepo.findAll();
		
	}

	@Override
	public boolean isEmployeeExists(Long empId) 
	{
		
		return employeeRepo.existsById(empId);
	}

}

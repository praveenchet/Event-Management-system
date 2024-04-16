package com.EventManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EventManagement.Entities.Employee;
import com.EventManagement.service.EmployeeServices;

@Controller
@RestController
@RequestMapping("/Employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeServices employeeServices;

	@PostMapping("/signup")//add
	public ResponseEntity<Employee>  addEmployee(@RequestBody Employee employee) 
	{
		return new ResponseEntity<Employee>(employeeServices.addEmployee(employee), HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployee() 
	{
		return new ResponseEntity<List<Employee>>(employeeServices.getAllEmployee(),HttpStatus.OK);
	}

	@GetMapping("/get/{empId}")
	public ResponseEntity<Employee>  getEmployeeById(@PathVariable Long empId) 
	{
		return new ResponseEntity<Employee>(employeeServices.getEmployeeById(empId),HttpStatus.OK);
	}

	@PutMapping("/update/empId")
	public ResponseEntity< Employee> updateEmployee(@PathVariable Long empId,@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeServices.updateEmployee(empId, employee), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public void deleteEmployeeById(@PathVariable Long empId) 
	{
		employeeServices.deleteEmployeeById(empId);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllEmployee()
	{
		employeeServices.deleteAllEmployee();
	}
}

package com.EventManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EventManagement.Entities.Customer;
import com.EventManagement.service.CustomerServices;

@Controller
@RestController
@RequestMapping("/Customer")
public class CustomerController 
{
	@Autowired
	private CustomerServices customerServices;
	
	@GetMapping("/showNewCustomerForm")
    public String showNewCustomerForm(Model model) {
    	//create model attribute to bind form data
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customerSignUp";
    }

	@PostMapping("/signup")//add
	public String addCustomer(@RequestBody Customer customer)
	{
		Customer cust= new Customer();
		new ResponseEntity<Customer>(customerServices.addCustomer(customer), HttpStatus.CREATED);
		return "log_InPage"; 
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Customer>> getAllCustomer() 
	{
		return new ResponseEntity<>(customerServices.getAllCustomer(),HttpStatus.OK);
	}

	@GetMapping("/get/{custId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long custId)
	{
		return new ResponseEntity<Customer>(customerServices.getCustomerById(custId), HttpStatus.OK);
	}
	
	@PutMapping("/update/{custId}")
	public ResponseEntity<Customer>  updateCustomer(@PathVariable Long custId,@RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customerServices.updateCustomer(custId, customer),HttpStatus.OK);
	}

	@DeleteMapping("/delete/{custId}")
	public void deleteCustomerById(@PathVariable Long custId) 
	{
		customerServices.deleteCustomerById(custId);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllCustomer()
	{
		customerServices.deleteAllCustomer();
	}
	
	

//	 @GetMapping("/")
//	    public String viewHomePage(Model model) 
//	 	{
//	        return "index";
//	    }
//
//	    @GetMapping("/showNewCustomerForm")
//	    public String showNewCustomerForm(Model model) {
//	    	//create model attribute to bind form data
//	        Customer customer = new Customer();
//	        model.addAttribute("customer", customer);
//	        return "customerSignUp";
//	    }
//
//	    @PostMapping("/addCustomer")
//	    public String addCustomer(@ModelAttribute("customer") Customer customer) 
//	    {
//	        customerServices.addCustomer(customer);
//	        return "log_InPage";
//    }
//	    
////	@GetMapping("/getAll")
////	public  List<Customer> getAllCustomer() 
////	{
////		return customerServices.getAllCustomer();
////	}
////
////	public Customer getCustomerById(Long custId) {
////		return customerServices.getCustomerById(custId);
////	}
////	*/
////
////	@GetMapping("/updateCustomer/{custId}")
////	public String updateCustomer(@PathVariable(value = "custId") Long custId, Model model) 
////	{
////		//get customer from the service
////		Customer customer=new Customer();
////		//set employee as a model attribute to pre-populate the form
////		model.addAttribute("Customer",customer);
////		return "redirect:/";
////	}
////
////	@GetMapping("/deleteCustomer/{custId}")
////	public String deleteCustomerById(@PathVariable(value = "custId") Long custId) 
////	{
////		//call delete employee method
////		this.customerServices.deleteCustomerById(custId);
////		return "redirect:/";
////	}
//
////	/*
////	public void deleteAllCustomer() {
////		customerServices.deleteAllCustomer();
////	}
////
////	public boolean isCustomerExists(Long custId)
////	{
////		return customerServices.isCustomerExists(custId);
////	}*/
////
////	//display list of employees
////	/*
////	
	
	
	
}

package com.EventManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EventManagement.Entities.Customer;

@Component
public interface CustomerServices 
{
	Customer  addCustomer(Customer  customer );
	
	List<Customer > getAllCustomer();
	
	Customer  getCustomerById(Long custId);
	
	Customer updateCustomer(Long custId , Customer  customer );
	
	Customer deleteCustomerById(Long custId );
	
	void deleteAllCustomer();
	
	boolean isCustomerExists(Long custId);
	
	Customer FindById(Long custId);
	
	Customer showNewCustomerForm(Customer customer);
	
	
}

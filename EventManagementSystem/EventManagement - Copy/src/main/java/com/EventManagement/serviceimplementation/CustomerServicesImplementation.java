package com.EventManagement.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.Customer;
import com.EventManagement.repository.CustomerRepository;
import com.EventManagement.service.CustomerServices;

@Service
public class CustomerServicesImplementation implements CustomerServices
{
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Customer addCustomer(Customer customer) 
	{	
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() 
	{
		return customerRepo.findAll();
	}

	@Override
	public Customer getCustomerById(Long custId) 
	{
		return customerRepo.findById(custId).get();
	}

	@Override
	public Customer updateCustomer(Long custId, Customer customer)
	{
		 Customer c = customerRepo.findById(custId).get();
		 c.setName(customer.getName());
		 c.setAge(customer.getAge());
		 c.setContactDetails(customer.getContactDetails());
		 c.setEmailAddress(customer.getEmailAddress());
		 return customerRepo.save(c);
	}

	@Override
	public Customer deleteCustomerById(Long custId)
	{
		return customerRepo.findById(custId).get();
		
	}

	@Override
	public void deleteAllCustomer() 
	{
		customerRepo.findAll();
		
	}

	@Override
	public boolean isCustomerExists(Long custId) 
	{
		
		return customerRepo.existsById(custId);
	}

	@Override
	public Customer FindById(Long custId) 
	{
		
		return customerRepo.findById(custId).get();
	}

	@Override
	public Customer showNewCustomerForm(Customer customer) 
	{
		
		return customerRepo.save(customer);
	}

}

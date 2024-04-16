package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventManagement.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}

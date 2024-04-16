package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventManagement.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	 User findByUsername(String username);
}

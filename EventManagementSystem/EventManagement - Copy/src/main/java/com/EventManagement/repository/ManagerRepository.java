package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventManagement.Entities.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long>
{

}

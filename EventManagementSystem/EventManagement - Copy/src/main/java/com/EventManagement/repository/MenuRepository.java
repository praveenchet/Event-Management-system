package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventManagement.Entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long>
{

}

package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventManagement.Entities.Events;

public interface EventsRepository extends JpaRepository<Events, Long>
{

}

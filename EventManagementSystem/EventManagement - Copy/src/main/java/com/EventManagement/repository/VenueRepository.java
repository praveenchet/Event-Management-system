package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EventManagement.Entities.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long>
{


}

package com.eticket.repo;


import java.util.Optional;

//Importing the necessary libraries

import org.springframework.data.jpa.repository.JpaRepository;


import com.eticket.entity.Event;

public interface EventRepo extends JpaRepository <Event,Integer> 
{
	
	public Event findByEventName(String name); //method to find an event by event name
	public Event findByEventLocation(String eventlocation);//method to find an event by event location
	public Event findByEventId(Integer eventid);//method to find an event by eventid

}


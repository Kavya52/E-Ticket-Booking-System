package com.eticket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eticket.entity.Customer;
import com.eticket.entity.Event;
import com.eticket.repo.EventRepo;

//Service class
@Service
public class EventServiceImpl implements EventService
{
   @Autowired
	EventRepo erepo;
   
	public EventServiceImpl(EventRepo erepo)
	{
	super();
	this.erepo = erepo;
    }
	//Get event by its Id
   @Override
	public Event getEvent(Integer id) 
    {
		Optional<Event> a=erepo.findById(id);
		Event a1=a.get();
		return a1;
	}
   //Retrieve all events
	@Override
	public List<Event> getAllEvents()
	{
		List<Event> b=erepo.findAll();
		return b;
	}
	//Insert a new event
	@Override
	public String insertEvent(Event e) 
	{
		erepo.save(e);
		return " One record has been inserted";
	}
	//Update an existing event
	@Override
	public String updateEvent(Event e) 
	{
		erepo.save(e);
		return " One record has been updated";
	}
	//Delete an event by its id
	@Override
	public String deleteEvent(Integer id) 
	{
		erepo.deleteById(id);
		return " One record has been deleted";
	}
	
	//Get an event by its name
	@Override
	public Event getByEventName(String name)
	{
		Event eventName=erepo.findByEventName(name);
		return eventName;
	}
	//Get an event by its location
	@Override
	public Event getByEventLocation(String eventlocation) 
	{
		Event eventLocation=erepo.findByEventLocation(eventlocation);
		return eventLocation;
	}
	@Override
	public Event getByEventId(Integer eventid) 
	{
		Event eventId=erepo.findByEventId(eventid);
		return eventId;
	}
	
}

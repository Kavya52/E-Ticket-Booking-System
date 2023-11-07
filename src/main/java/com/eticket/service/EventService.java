package com.eticket.service;

import java.util.List;
import java.util.Optional;

import com.eticket.entity.Event;

public interface EventService 
{
public Event getEvent(Integer id);//Retrieve a event by their id
public List<Event>getAllEvents();//Retrieve all events
public String insertEvent(Event e);//Insert a new event
public String updateEvent(Event e);//Update an existing event
public String deleteEvent(Integer id);//delete event by their id


public Event getByEventName(String name);//method to get a event by its name
public Event getByEventLocation(String eventlocation);//  method to get a event by its location
public Event getByEventId(Integer eventid);
}




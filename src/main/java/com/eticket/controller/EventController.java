package com.eticket.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.eticket.entity.Event;
import com.eticket.service.EventService;
import com.eticket.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// RestController for handling Event related endpoints
@RestController
@CrossOrigin
public class EventController {

    private final EventService eservice; // Autowired EventService

    @Autowired
    public EventController(EventService eservice) {
    	super();
        this.eservice = eservice;
    }

    // Endpoint to get all events
    @GetMapping("/getallevents")
    public ResponseEntity<List<Event>> getall() {
        List<Event> list = eservice.getAllEvents();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // Endpoint to insert a new event
    @PostMapping("/insertevents")
    public ResponseEntity<String> insertevents(@RequestBody Event e) {
        String s = eservice.insertEvent(e);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

    // Endpoint to get an event by its ID
    @GetMapping("/getevent/{id}")
    public ResponseEntity<Event> getevent(@PathVariable("id") Integer id) {
        Event e = eservice.getEvent(id);
        return new ResponseEntity<>(e, HttpStatus.OK);
    }

    // Endpoint to update an existing event
    @PutMapping("/updateevent")
    public ResponseEntity<String> updateevent(@RequestBody Event e) {
        String s = eservice.updateEvent(e);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

    // Endpoint to delete an event by its ID
    @DeleteMapping("/deleteevent/{id}")
    public ResponseEntity<String> deleteevent(@PathVariable("id") Integer id) {
        String s = eservice.deleteEvent(id);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    // Endpoint to get an event by its name
    @GetMapping("/get-by-event/{name}")
    public ResponseEntity<Event> getEventByName(@PathVariable("name") String name) {
        Event e = eservice.getByEventName(name);
        return new ResponseEntity<>(e, HttpStatus.OK);
    }

    // Endpoint to get an event by its location
    @GetMapping("/get-by-event/location/{location}")
    public ResponseEntity<Event> getEventByLocation(@PathVariable("location") String location) {
        Event e = eservice.getByEventLocation(location);
        return new ResponseEntity<>(e, HttpStatus.OK);
    }
}
    
    



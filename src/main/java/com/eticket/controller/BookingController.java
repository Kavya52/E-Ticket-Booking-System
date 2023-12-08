package com.eticket.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eticket.Exception.ResourceNotFoundException;
import com.eticket.entity.Booking;
import com.eticket.entity.Event;
import com.eticket.service.BookingService;

// RestController for handling Booking related endpoints
@RestController
@CrossOrigin
public class BookingController {

    private final BookingService bservice; // Autowired BookingService

    @Autowired
    public BookingController(BookingService bservice) {
    	super();
        this.bservice = bservice;
    }

    // Endpoint to get all bookings
    @GetMapping("/getallbookings")
    public ResponseEntity<List<Booking>> getall() {
        List<Booking> list = bservice.getAllBookings();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // Endpoint to insert a new booking
    @PostMapping("/insertbooking")
    public ResponseEntity<String> insertbooking(@RequestBody Booking b) {
        String s = bservice.insertBooking(b);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

    // Endpoint to update an existing booking
    @PutMapping("/updatebooking")
    public ResponseEntity<String> updatebooking(@RequestBody Booking b) {
        String s = bservice.updateBooking(b);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

    // Endpoint to delete a booking by its ID
    @DeleteMapping("/deletebooking/{id}")
    public ResponseEntity<String> deletebooking(@PathVariable("id") Integer id) {
        String s = bservice.deleteBooking(id);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    // Endpoint to get a booking by its booking date
    @GetMapping("/get-by-booking/bookingDate/{date}")
    public ResponseEntity<Booking> getBookingDate(@PathVariable("date") String date) {
        Booking b = bservice.getByBookingDate(date);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }

    @GetMapping("/get-by-booking/ticketscount/{count}")
    public ResponseEntity<Booking> getTicketsCount(@PathVariable("count") Integer count) {
        Booking b = bservice.getByTicketsCount(count);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }
    
    @GetMapping("/getbookings/{id}")
    public ResponseEntity<String> getbooking(@PathVariable("id") Integer id) {
        try {
            Booking b = bservice.getBooking(id);
            if (b == null) {
                
                throw new ResourceNotFoundException("Booking not found with ID:" +id);
            } else {
                
                return  ResponseEntity.ok(b.toString());
            }
        } catch (ResourceNotFoundException e) {
           
        	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
           
            return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
    
 

    







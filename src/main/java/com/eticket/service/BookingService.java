package com.eticket.service;

import java.util.List;
import java.util.Optional;

import com.eticket.entity.Booking;
import com.eticket.entity.Event;


//Service interface for the Booking entity
public interface BookingService  
{
	
	public Booking getBooking(Integer id);// Retrieve a booking by its ID
	public List<Booking>getAllBookings(); // Retrieve all bookings
	public String insertBooking(Booking b);//Insert a new booking
	public String updateBooking(Booking b);//    // Update an existing booking
	public String deleteBooking(Integer id);// Delete a booking by its ID

	public Booking getByBookingDate(String bookingdate);//  method to get a booking by its booking date
	public Booking getByTicketsCount(Integer ticketscount);
	

}




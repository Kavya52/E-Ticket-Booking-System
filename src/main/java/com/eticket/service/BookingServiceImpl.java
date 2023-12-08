package com.eticket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eticket.Exception.ResourceNotFoundException;
import com.eticket.entity.Booking;
import com.eticket.entity.Event;
import com.eticket.entity.Payment;
import com.eticket.repo.BookingRepo;

//Service class
@Service
public class BookingServiceImpl implements BookingService
{
    @Autowired
    BookingRepo brepo;
    
	public BookingServiceImpl(BookingRepo brepo)
	{
		super();
		this.brepo = brepo;
	}
    
	// Retrieve a booking by its ID
	@Override
	public Booking getBooking(Integer id) 
	{
		Optional<Booking> booking = brepo.findById(id);
        if (booking.isPresent())
        {
            return booking.get();
        } else 
        {
            throw new ResourceNotFoundException("Booking not found with ID:"+id); // Custom exception for resource not found
        }
    }
		
	// Retrieve all bookings
	@Override
	public List<Booking> getAllBookings()
	{
		List<Booking> b=brepo.findAll();
		return b;
	}
	
    // Insert a new booking
	@Override
	public String insertBooking(Booking b) 
	{   
		brepo.save(b);
		return " One record has been inserted into booking details";
		
	}
    // Update an existing booking
	@Override
	public String updateBooking(Booking b) 
	{
		brepo.save(b);
		return " One record has been updated into booking details";
	}
    // Delete a booking by its ID
	@Override
	public String deleteBooking(Integer id) 
	{
		brepo.deleteById(id);
		return " One record has been deleted into booking details";
	}

    // Get a booking by its booking date
	@Override
	public Booking getByBookingDate(String bookingdate)
	{
		Booking bookingDate=brepo.findByBookingDate(bookingdate);
		return bookingDate;
	}
    
	@Override
	public Booking getByTicketsCount(Integer ticketscount) {
		Booking ticketsCount=brepo.findByTicketsCount(ticketscount);
		return ticketsCount;
	}
	
}
	

	
	
	

	
	



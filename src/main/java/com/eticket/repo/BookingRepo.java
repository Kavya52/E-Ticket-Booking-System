package com.eticket.repo;

//Importing the necessary libraries
import org.springframework.data.jpa.repository.JpaRepository;
import com.eticket.entity.Booking;


public interface BookingRepo extends JpaRepository <Booking,Integer> 
{
	
	public Booking findByBookingDate(String bookingdate);//method to find a booking by booking date
	public Booking findByTicketsCount(Integer ticketscount);//method to find a booking by ticketscount
	public Booking findBybookingId(Booking bookingId);////method to find a booking by bookingId
	
}



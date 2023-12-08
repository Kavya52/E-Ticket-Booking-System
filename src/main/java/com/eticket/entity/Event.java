package com.eticket.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Event 
{
@Id
private Integer eventId;
private String  eventName;
private String  eventDate;
private String  eventLocation;
private String eventTime;
private Integer ticketPrice;





/*//@JsonManagedReference("event-bookings")
@OneToMany(mappedBy = "event")
private List<Booking> booking;*/



}



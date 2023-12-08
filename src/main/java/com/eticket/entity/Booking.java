package com.eticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

//Entity class
@Entity
@Data
public class Booking{
@Id
private Integer bookingId;
private String bookingDate;
private Integer ticketsCount;


//ManyToOne Relation with customer
@ManyToOne
@JoinColumn(name = "customerId")
private Customer customer;

//ManyToOne Relation with event
@ManyToOne
@JoinColumn(name = "eventId")
private Event event;


}

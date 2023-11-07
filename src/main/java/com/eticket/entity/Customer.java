package com.eticket.entity;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Customer 
{
@Id
private Integer customerId;
private String  customerName;
private String  email;
private String  customerAddress;
private Long phoneNumber;


/*//OneToMany Relation with Event
@OneToMany(targetEntity=Customer.class,cascade=CascadeType.ALL)
private List<Event>event=new ArrayList<Event>();

//OneToOne Relation with Booking
@OneToOne(targetEntity=Booking.class,cascade=CascadeType.ALL)
private Booking booking;

//OneToOne Relation with Payment
@OneToOne(targetEntity=Payment.class)
private Payment payment;*/

}


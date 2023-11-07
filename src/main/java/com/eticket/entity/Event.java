package com.eticket.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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


//ManyToOne Relation with customer
@ManyToOne
@JoinColumn(name="customerId")
private Customer customer;

/*//OneToMany Relation with Event
@OneToMany(targetEntity=Event.class,cascade=CascadeType.ALL)
private List<Booking>booking=new ArrayList<Booking>();*/

}



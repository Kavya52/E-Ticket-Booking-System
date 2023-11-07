package com.eticket.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

//Entity class
@Entity
@Data
public class Booking{
@Id
private Integer bookingId;
private Integer  customerId;
private Integer  eventId;
private String bookingDate;
private Integer ticketsCount;

/*//OneToOne Relation with Customer
@OneToOne(targetEntity=Customer.class,cascade=CascadeType.ALL)
private Customer customer;*/


}

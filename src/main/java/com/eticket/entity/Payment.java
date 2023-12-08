package com.eticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Payment 
{
@Id
private Integer paymentId;
private String  paymentMode;
private String  paymentDate;



//ManyToOne Relation with customer
@ManyToOne
@JoinColumn(name = "customerId")
private Customer customer;

//ManyToOne Relation with customer
@ManyToOne
@JoinColumn(name = "bookingId")
private Booking booking;


}


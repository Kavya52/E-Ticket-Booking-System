package com.eticket.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Payment 
{
@Id
private Integer paymentId;
private String  paymentMode;
private String  paymentDate;
private Integer customerId;
private Integer bookingId;

/*//OneToOne Relation with Customer
@OneToOne(targetEntity=Customer.class,cascade=CascadeType.ALL)
private Customer customer;*/

}


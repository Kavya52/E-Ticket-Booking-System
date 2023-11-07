package com.eticket.repo;

//Importing the necessary libraries

import org.springframework.data.jpa.repository.JpaRepository;


import com.eticket.entity.Payment;

public interface PaymentRepo extends JpaRepository <Payment,Integer>
{
	public Payment findByPaymentMode(String paymode);// method to find a payment by payment mode

	public Payment findByPaymentDate(String paydate);// method to find a payment by payment date
	  
}


package com.eticket.repo;


//Importing the necessary libraries

import org.springframework.data.jpa.repository.JpaRepository;

import com.eticket.entity.Customer;

public interface CustomerRepo extends JpaRepository <Customer,Integer> 
{ 
    
    public Customer findByCustomerName(String name);// method to find a customer by customer name
	public Customer findByemail(String email);// method to find a customer by email
    public Customer findByCustomerAddress(String custaddress);// method to find a customer by customer address

}



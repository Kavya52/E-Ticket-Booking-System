package com.eticket.service;

import java.util.List;

import com.eticket.entity.Customer;

public interface CustomerService  
{
	
public Customer getCustomer(Integer id);// Retrieve a customer by their ID
public List<Customer>getAllCustomers();// Retrieve all customers
public String insertCustomer(Customer c);//Insert a new customer
public String updateCustomer(Customer c);//Update an existing customer
public String deleteCustomer(Integer id);// Delete a customer by their ID

public Customer getByCustomerName(String name);// method to get a customer by their name
public Customer getByemail(String email);//method to get a customer by their email
public Customer getByCustomerAddress(String custaddress);//method to get a customer by their address
  
}


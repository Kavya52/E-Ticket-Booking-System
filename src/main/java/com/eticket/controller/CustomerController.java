package com.eticket.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eticket.entity.Customer;
import com.eticket.service.CustomerService;

//RestController for handling Customer related endpoints
@RestController
public class CustomerController 
{
    @Autowired
	CustomerService cservice;// Autowired CustomerService

	public CustomerController(CustomerService cservice) 
	{
		super();
		this.cservice = cservice;
	}
	
    // Endpoint to get all customers
	@GetMapping("/getallcustomers")
	public ResponseEntity<List<Customer>> getall()
	{
		List<Customer> list=cservice.getAllCustomers();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
    // Endpoint to insert a new customer
	@PostMapping("/insertcustomer")
	public ResponseEntity<String> insertcustomer(@RequestBody Customer d)
	{
		String s=cservice.insertCustomer(d);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
	
    // Endpoint to get customer by their id
	@GetMapping("/getcustomer/{id}")
	public ResponseEntity<Customer> getcustomer(@PathVariable("id") Integer id)
	{
		Customer c=cservice.getCustomer(id);
		return new ResponseEntity<>(c,HttpStatus.OK);
	}
	
    // Endpoint to update an existing customer
	@PutMapping("/updatecustomer")
	public ResponseEntity<String> updatecustomer(@RequestBody Customer d)
	{
		String s=cservice.updateCustomer(d);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
	
    // Endpoint to delete a customer by their ID
	@DeleteMapping("/deletecustomer/{id}")
	public ResponseEntity<String> deletecustomer(@PathVariable("id") Integer id)
	{
		String s=cservice.deleteCustomer(id);
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
	
	// Endpoint to get a customer by their name
	@GetMapping("/get-by-customername/{custname}")
	public ResponseEntity<Customer> getcustname(@PathVariable("custname") String custname)
	{
		Customer c=cservice.getByCustomerName(custname);
		return new ResponseEntity<>(c,HttpStatus.OK);
	}
	
    // Endpoint to get a customer by their email
	@GetMapping("/get-by-email/{email}")
	public ResponseEntity<Customer> getemail(@PathVariable("email") String email)
	{
		Customer c=cservice.getByemail(email);
		return new ResponseEntity<>(c,HttpStatus.OK);
	}
	
    // Endpoint to get a customer by their address
	@GetMapping("/get-by-custaddress/{custaddress}")
	public ResponseEntity<Customer> getcustaddress(@PathVariable("custaddress") String custaddress)
	{
		 Customer c=cservice.getByCustomerAddress(custaddress);
		return new ResponseEntity<>(c,HttpStatus.OK);
	}
}


	
      
      





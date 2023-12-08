package com.eticket.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.eticket.entity.Payment;
import com.eticket.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// RestController for handling Payment related endpoints
@RestController
@CrossOrigin
public class PaymentController {

    private final PaymentService pservice; // Autowired PaymentService

    @Autowired
    public PaymentController(PaymentService pservice) {
    	super();
        this.pservice = pservice;
    }

    // Endpoint to get all payments
    @GetMapping("/getallpayments")
    public ResponseEntity<List<Payment>> getall() {
        List<Payment> list = pservice.getAllPayments();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // Endpoint to insert a new payment
    @PostMapping("/insertpayments")
    public ResponseEntity<String> insertpayments(@RequestBody Payment p) {
        String s = pservice.insertPayment(p);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

    // Endpoint to get a payment by its ID
    @GetMapping("/getpayment/{id}")
    public ResponseEntity<Payment> getpayment(@PathVariable("id") Integer id) {
        Payment p = pservice.getPayment(id);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    // Endpoint to update an existing payment
    @PutMapping("/updatepayment")
    public ResponseEntity<String> updatepayment(@RequestBody Payment p) {
        String s = pservice.updatePayment(p);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

    // Endpoint to delete a payment by its ID
    @DeleteMapping("/deletepayment/{id}")
    public ResponseEntity<String> deletepayment(@PathVariable("id") Integer id) {
        String s = pservice.deletePayment(id);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    // Endpoint to get a payment by its mode
    @GetMapping("/get-by-paymode/{mode}")
    public ResponseEntity<Payment> getpaymode(@PathVariable("mode") String mode) {
        Payment p = pservice.getByPaymentMode(mode);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    // Endpoint to get a payment by its date
    @GetMapping("/get-by-paydate/{date}")
    public ResponseEntity<Payment> getpaydate(@PathVariable("date") String date) {
        Payment p = pservice.getByPaymentDate(date);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
}
    

    



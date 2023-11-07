package com.eticket.service;

import java.util.List;

import com.eticket.entity.Payment;

public interface PaymentService  
{
public Payment getPayment(Integer id);// Retrieve a payment by its ID
public List<Payment>getAllPayments();//Retrieve all payments
public String insertPayment(Payment p);//Insert a new payment
public String updatePayment(Payment p);//update an existing payment
public String deletePayment(Integer id);//delete payment by its id

public Payment getByPaymentMode(String paymode);//method to get payment by its mode
public Payment getByPaymentDate(String paydate);//method to get payment by its date

}



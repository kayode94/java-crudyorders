package com.orderspractice.demo.services;

import com.orderspractice.demo.models.Customer;

import java.util.List;

public interface CustomerServices
{
    Customer save(Customer customer);

    List<Customer> findAllCustomers();

    List<Customer> findCustomerById(long custid);

    List<Customer> findByCustomerName(String custname);
}

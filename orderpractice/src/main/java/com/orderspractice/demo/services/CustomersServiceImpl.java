package com.orderspractice.demo.services;

import com.orderspractice.demo.models.Customer;
import com.orderspractice.demo.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerServices")
public class CustomersServiceImpl implements CustomerServices
{
    @Autowired
    private CustomersRepository customerrepos;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return customerrepos.save(customer);
    }

    @Override
    public List<Customer> findAllCustomers()
    {
        List<Customer> myList = new ArrayList<>();
        customerrepos.findAll().iterator().forEachRemaining(myList::add);
        return myList;
    }

    @Override
    public List<Customer> findCustomerById(long custid) throws EntityNotFoundException
    {
        return customerrepos.findById(custid).orElseThrow(()-> new EntityNotFoundException("Customer " + custid + " Not Found"));
    }

    @Override
    public List<Customer> findByCustomerName(String custname) {
        return customerrepos.findByCustnameContainingIgnoringCase(custname);
    }
}

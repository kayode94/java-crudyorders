package com.orderspractice.demo.repositories;

import com.orderspractice.demo.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomersRepository extends CrudRepository<Customer, Long>
{
    List<Customer> findByCustnameContainingIgnoringCase(String name);
}

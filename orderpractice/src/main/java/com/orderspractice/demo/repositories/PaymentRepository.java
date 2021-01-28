package com.orderspractice.demo.repositories;

import com.orderspractice.demo.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long>
{

}

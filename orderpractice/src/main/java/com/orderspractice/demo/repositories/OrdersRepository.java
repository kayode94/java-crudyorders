package com.orderspractice.demo.repositories;

import com.orderspractice.demo.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long>
{
}

package com.orderspractice.demo.services;

import com.orderspractice.demo.models.Order;
import com.orderspractice.demo.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "orderServices")
public class OrdersServicesImpl implements OrderServices
{
    @Autowired
    private OrdersRepository orderrepos;


    @Override
    public Order save(Order order) {
        return orderrepos.save(order);
    }
}

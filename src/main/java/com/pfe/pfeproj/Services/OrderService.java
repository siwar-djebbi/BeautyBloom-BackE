package com.pfe.pfeproj.Services;

import com.pfe.pfeproj.Entities.Order;
import com.pfe.pfeproj.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
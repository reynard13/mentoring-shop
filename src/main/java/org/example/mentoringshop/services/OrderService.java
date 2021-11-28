package org.example.mentoringshop.services;

import org.example.mentoringshop.models.Order;
import org.example.mentoringshop.repositories.Dao;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private Dao<Order> orderRepository;

    public OrderService(Dao<Order> orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    public Order getOrder(int index) {
        return orderRepository.get(index);
    }
}

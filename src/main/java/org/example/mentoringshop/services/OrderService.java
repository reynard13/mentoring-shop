package org.example.mentoringshop.services;

import org.example.mentoringshop.models.Order;
import org.example.mentoringshop.repositories.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addOrder(Order order) {
//        System.out.println("save order: " + order);
        orderRepository.save(order);
    }

    public Order getOrder(int index) {
        return orderRepository.get(index);
    }
}

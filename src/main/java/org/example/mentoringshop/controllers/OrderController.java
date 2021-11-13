package org.example.mentoringshop.controllers;


import org.example.mentoringshop.models.Order;
import org.example.mentoringshop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public Order getOrder(@RequestParam Integer id) {
//        System.out.println("add id: " + id);
        return orderService.getOrder(id);
    }

    @PostMapping (consumes = {
            MediaType.APPLICATION_JSON_VALUE
    },
    produces = {
            MediaType.APPLICATION_JSON_VALUE
    })
    public Order store(@RequestBody Order order) {
//        System.out.println("add order: " + order);
        orderService.addOrder(order);
        return order;
    }
}

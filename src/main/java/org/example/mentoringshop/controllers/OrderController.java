package org.example.mentoringshop.controllers;


import org.example.mentoringshop.models.Order;
import org.example.mentoringshop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public Order getOrder(@RequestParam Integer id) {
        return orderService.getOrder(id);
    }

    @PostMapping
    public Order store(@RequestBody Order order) {
        orderService.addOrder(order);
        return order;
    }
}

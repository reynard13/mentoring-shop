package org.example.mentoringshop.repositories;

import org.example.mentoringshop.models.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class OrderRepository {
    private int index;
    private HashMap<Integer, Order> mapOrders;

    public OrderRepository() {
        mapOrders = new HashMap<>();
        index = 1;
    }

    public void save(Order order) {
        order.setId(index);
        mapOrders.put(index, order);
        System.out.println("get info map (save): " + mapOrders.get(index));
        index++;
    }

    public Order get(int index) {
        return mapOrders.get(index);
    }

}

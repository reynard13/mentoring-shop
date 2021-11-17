package org.example.mentoringshop.repositories;

import org.example.mentoringshop.models.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class OrderRepository implements Dao<Order>{
    private int index;
    private final HashMap<Integer, Order> mapOrders;

    public OrderRepository() {
        mapOrders = new HashMap<>();
        index = 1;
    }
    @Override
    public void save(Order order) {
        order.setId(index);
        mapOrders.put(index, order);
        index++;
    }
    @Override
    public Order get(int index) {
        return mapOrders.get(index);
    }

}

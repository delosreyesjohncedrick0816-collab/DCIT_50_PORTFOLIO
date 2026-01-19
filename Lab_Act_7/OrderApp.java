package com.store.main;

import com.store.order.*;
import java.util.ArrayList;
import java.util.Iterator;

public class OrderApp {

    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new OnlineOrder(1, 250.00));
        orders.add(new OnlineOrder(2, 120.50));
        orders.add(new OnlineOrder(3, 300.75));

        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order.getOrderSummary());

            if (order.getStatus() == OrderStatus.CANCELLED) {
                iterator.remove();
            }
        }
    }
}

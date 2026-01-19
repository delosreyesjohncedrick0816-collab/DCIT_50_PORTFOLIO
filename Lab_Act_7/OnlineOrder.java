package com.store.order;

import com.store.payment.Payable;

public class OnlineOrder extends Order implements Payable {

    public OnlineOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("Processing online order ID: " + getOrderId());
    }

    @Override
    public void pay() {
        System.out.println("Payment successful for order ID: " + getOrderId());
        setStatus(OrderStatus.PAID);
    }
}

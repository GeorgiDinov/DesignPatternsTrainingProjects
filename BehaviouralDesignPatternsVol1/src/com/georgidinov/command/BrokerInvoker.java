package com.georgidinov.command;

import java.util.LinkedList;

class BrokerInvoker {

    private final LinkedList<OrderCommand> orders;

    public BrokerInvoker() {
        this.orders = new LinkedList<>();
    }//end of constructor

    public void takeOrder(OrderCommand order) {
        this.orders.addLast(order);
    }//end of method takeOrder

    public void placeOrder() {
        for (OrderCommand order : this.orders) {
            order.execute();
        }
        this.orders.clear();
    }//end of method placeOrder

}//end of class BrokerInvoker

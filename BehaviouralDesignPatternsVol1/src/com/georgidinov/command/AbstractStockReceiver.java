package com.georgidinov.command;

abstract class AbstractStockReceiver {
    private String name;
    private int quantity;

    public AbstractStockReceiver(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }//end of constructor

    protected String getName() {
        return name;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected abstract void buy();

    protected abstract void sell();

}//end of abstract class AbstractStockReceiver

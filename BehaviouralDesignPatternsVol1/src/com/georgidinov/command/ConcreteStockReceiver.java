package com.georgidinov.command;

class ConcreteStockReceiver extends AbstractStockReceiver {

    public ConcreteStockReceiver(String name, int quantity) {
        super(name, quantity);
    }//end of constructor

    @Override
    public void buy() {
        System.out.println("Receiver: [ Buying  " +
                this.getQuantity() + " pcs. of " +
                this.getName() + " ]");
    }//end of method buy

    @Override
    public void sell() {
        System.out.println("Receiver: [ Selling " +
                this.getQuantity() + " pcs. of " +
                this.getName() + " ]");
    }//end of method sell

}//end of class ConcreteStockReceiver

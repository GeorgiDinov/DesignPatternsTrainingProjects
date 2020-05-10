package com.georgidinov.chainofresponsibility.atmmoneydispenser;

class Currency {

    private final int amount;

    public Currency(int amount) {
        this.amount = amount;
    }//end of constructor

    public int getAmount() {
        return amount;
    }//end of method getAmount

}//end of class Currency

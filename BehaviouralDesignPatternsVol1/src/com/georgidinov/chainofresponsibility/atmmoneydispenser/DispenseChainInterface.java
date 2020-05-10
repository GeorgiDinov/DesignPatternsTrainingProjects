package com.georgidinov.chainofresponsibility.atmmoneydispenser;

interface DispenseChainInterface {

    void setNextInChain(DispenseChainInterface nextInChain);

    void dispense(Currency currency);

}//end of interface DispenseChainInterface


//Concrete implementations

class FiftyDollarBills implements DispenseChainInterface {

    private DispenseChainInterface next;

    @Override
    public void setNextInChain(DispenseChainInterface nextInChain) {
        this.next = nextInChain;
    }//end of method setNextInChain

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int numberOfFiftyDollarBills = currency.getAmount() / 50;
            int remainingBills = currency.getAmount() % 50;
            System.out.println("ATM: dispense " + numberOfFiftyDollarBills + " $50 bill.");

            if (remainingBills != 0) {

                if (this.next != null) {
                    this.next.dispense(new Currency(remainingBills));
                } else {
                    System.out.println("You've reached the end of the chain!");
                }
            }

        } else if (this.next != null) {
            this.next.dispense(currency);
        }

    }//end of method dispense

}//end of class FiftyDollarBills

class TwentyDollarBills implements DispenseChainInterface {

    private DispenseChainInterface next;

    @Override
    public void setNextInChain(DispenseChainInterface nextInChain) {
        this.next = nextInChain;
    }//end of method setNextInChain

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int numberOfFiftyDollarBills = currency.getAmount() / 20;
            int remainingBills = currency.getAmount() % 20;
            System.out.println("ATM: dispense " + numberOfFiftyDollarBills + " $20 bill.");

            if (remainingBills != 0) {

                if (this.next != null) {
                    this.next.dispense(new Currency(remainingBills));
                } else {
                    System.out.println("You've reached the end of the chain!");
                }
            }

        } else if (this.next != null) {
            this.next.dispense(currency);
        }

    }//end of method dispense

}//end of class TwentyDollarBills

class TenDollarBills implements DispenseChainInterface {

    private DispenseChainInterface next;

    @Override
    public void setNextInChain(DispenseChainInterface nextInChain) {
        this.next = nextInChain;
    }//end of method setNextInChain

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int numberOfFiftyDollarBills = currency.getAmount() / 10;
            int remainingBills = currency.getAmount() % 10;
            System.out.println("ATM: dispense " + numberOfFiftyDollarBills + " $10 bill.");

            if (remainingBills != 0) {

                if (this.next != null) {
                    this.next.dispense(new Currency(remainingBills));
                } else {
                    System.out.println("You've reached the end of the chain!");
                }
            }

        } else if (this.next != null) {
            this.next.dispense(currency);
        }

    }//end of method dispense

}//end of class FiftyDollarBills
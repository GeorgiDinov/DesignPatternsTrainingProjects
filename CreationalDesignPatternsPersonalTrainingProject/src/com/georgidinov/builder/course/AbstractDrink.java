package com.georgidinov.builder.course;

abstract class AbstractDrink implements Item {
    @Override
    public Pack getPacking() {
        return new Bottle();
    }
}//end of abstract class AbstractDrink

class PepsiCola extends AbstractDrink {

    @Override
    public String getName() {
        return "Pepsi-Cola";
    }

    @Override
    public double getPrice() {
        return 0.75d;
    }

}//end of class PepsiCola

class CocaCola extends AbstractDrink {

    @Override
    public String getName() {
        return "Coca-Cola";
    }

    @Override
    public double getPrice() {
        return 0.85d;
    }

}//end of class CocaCola

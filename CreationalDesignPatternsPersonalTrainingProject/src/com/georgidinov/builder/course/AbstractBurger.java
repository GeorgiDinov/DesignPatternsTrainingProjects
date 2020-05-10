package com.georgidinov.builder.course;

abstract class AbstractBurger implements Item {
    @Override
    public Pack getPacking() {
        return new Wrapper();
    }
}//end of abstract class AbstractBurger

class VegetarianBurger extends AbstractBurger {

    @Override
    public String getName() {
        return "Vegetarian Burger";
    }

    @Override
    public double getPrice() {
        return 2.25d;
    }

}//end of class VegetarianBurger

class RegularBurger extends AbstractBurger {

    @Override
    public String getName() {
        return "Regular Burger";
    }

    @Override
    public double getPrice() {
        return 3.75d;
    }

}//end of class RegularBurger

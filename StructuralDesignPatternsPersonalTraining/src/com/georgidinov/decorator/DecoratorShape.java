package com.georgidinov.decorator;

//Component interface
interface DecoratorShape {
    void draw();
}//end of interface DecoratorShape

class Rectangle implements DecoratorShape {
    @Override
    public void draw() {
        System.out.println("\tDecorator Shape: " + getClass().getSimpleName() + " is drawn");
    }
}//end of class Rectangle

class Circle implements DecoratorShape {
    @Override
    public void draw() {
        System.out.println("\tDecorator Shape: " + getClass().getSimpleName() + " is drawn");
    }
}//end of class Circle

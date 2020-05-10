package com.georgidinov.abstractfactory.course;

class AbstractFactoryClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t<<<Abstract Factory Design Pattern>>>");
        AbstractFactory factory = FactoryProducer.getFactory("shape");

        AbstractFactoryShape rectangle = factory.getShape("rectangle");
        AbstractFactoryShape circle = factory.getShape("circle");
        AbstractFactoryShape square = factory.getShape("square");
        System.out.println("ShapeFactory called: ");
        rectangle.draw();
        circle.draw();
        square.draw();

        System.out.println("\nColorFactory called: ");
        factory = FactoryProducer.getFactory("color");
        AbstractFactoryColor red = factory.getColor("red");
        AbstractFactoryColor green = factory.getColor("green");
        AbstractFactoryColor blue = factory.getColor("blue");
        red.fill();
        green.fill();
        blue.fill();


    }//end of main method

}//end of class AbstractFactoryClient

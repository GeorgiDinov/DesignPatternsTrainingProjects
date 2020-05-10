package com.georgidinov.factory.course;

class FactoryClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t<<<Factory Design Pattern>>>");
        //Abstract creator demo
        System.out.println("\n***Abstract Creator***");
        Shape rectangle = new RectangleFactory().getShape();
        Shape circle = new CircleFactory().getShape();
        Shape square = new SquareFactory().getShape();
        rectangle.draw();
        circle.draw();
        square.draw();

        //Concrete creator demo
        System.out.println("\n***Concrete Creator***");
        ConcreteShapeFactory concreteShapeFactory = new ConcreteShapeFactory();
        Shape anotherRectangle = concreteShapeFactory.getShape("Rectangle");
        Shape anotherCircle = concreteShapeFactory.getShape("Circle");
        Shape anotherSquare = concreteShapeFactory.getShape("Square");
        anotherRectangle.draw();
        anotherCircle.draw();
        anotherSquare.draw();

    }//end of main method

}//end of class Client

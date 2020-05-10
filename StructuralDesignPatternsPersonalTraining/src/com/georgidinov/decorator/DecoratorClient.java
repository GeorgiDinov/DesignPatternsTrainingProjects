package com.georgidinov.decorator;


//Decorator design pattern aims to extend functionality of an existing object
//It favours "composition over inheritance"
//Also good example of "open for extension, closed for modification"
//If we extend the functionality with inheritance we will create dependencies
//between sub and super classes, and the functionality extension will be static
//We want to make "run time"  modification(extension) and only on a certain objects,
//not all of them(if we subclass)
//How to achieve this
//In our example we have the DecoratorShape interface with two concrete implementations
//Rectangle and Circle classes, we want to extend their functionality by adding new one
//to the existing without changing anything
//
//  1.We make abstract class for the actual "Decorators(all concrete implementations)"
//then our class implements the interface we want to decorate(in our case DecoratorShape)
//  2.We need a member variable from the same type we are going to decorate(DecoratorShape)
//it is declared "protected" so it's shared among all concrete implementations(classes) extending
//our abstract class
//  3.Passing the object to be decorated via the constructor and initializing our member variable
//overriding the method we want to decorate(extend, improve, add to new things and functionality)
//inside in that method we just make our member variable call it's own implementation of the method
//  4.In every concrete implementation we override that same method and add call to super or directly to
//the member variable(decoratorShape) method and then or before that call we add our new functionality
//Then polymorphism is doing it's job as you will see in the client,
//all objects(regular or decorated) are from the same type

class DecoratorClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Decorator Design Pattern>>>\n");
        DecoratorShape rectangle = new Rectangle();
        DecoratorShape circle = new Circle();
        System.out.println("Calling objects BEFORE decoration: ");
        rectangle.draw();
        circle.draw();

        System.out.println("\nCalling same objects AFTER decoration, adding red colored border: ");
        DecoratorShape redBordered = new ShapeBorderDecorator(rectangle, "red");
        redBordered.draw();
        redBordered = new ShapeBorderDecorator(circle, "red");
        redBordered.draw();

        System.out.println("\nCalling same objects AFTER decoration, adding green colored border: ");
        DecoratorShape greenBordered = new ShapeBorderDecorator(rectangle, "green");
        greenBordered.draw();
        greenBordered = new ShapeBorderDecorator(circle, "green");
        greenBordered.draw();

    }//end of main method

}//end of class DecoratorClient

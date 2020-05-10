package com.georgidinov.templatemethod;

//Template Method Design Pattern
//defines steps of an algorithm in a method , and each step is a method itself
//Typically you will have an abstract class defining the template method
//this method must be Final so subclasses cannot override it and change the algorithm steps
//you can have default methods- private or final if we know that this implementation wont change
//you will have also and abstract methods those are the methods representing the steps subclasses
//have to implement
//then we have also hook methods
//if we kind want to have some conditional behaviour we can use hook methods
//in our case we have a hook method if we want to paint the house
//we do have default behaviour for that method ,but we can override it by overriding the hook method
//and the corresponding default method(not final or private, could be empty)
//also hook methods may be just empty, and again if we override them we can HOOK slightly different
//implementation of the template method, but with the same sequence
//Note that here the higher level class controls the flow and do not depend on the lower level class
//Instructor mentioned it as the
//      "Hollywood Principle" - "Don't call us, We'll call you!"
//It is technique based on the Dependency Inversion principle
//Low and High level components should depend on abstraction
//
class TemplateMethodClient {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Template Method Design Pattern>>>\n");

        HouseTemplate brickHouse = new BrickHouse();
        HouseTemplate woodenHouse = new WoodenHouse();

        System.out.println("We've created brick and wooden houses, \n" +
                "the Wooden House hook method will help so that a call to the " +
                "color method will be displayed\n" +
                "the Brick House will override the pool hook method\n");

        brickHouse.buildHouse();
        System.out.println("-----------------------------------------");
        woodenHouse.buildHouse();

    }//end of main method

}//end of class TemplateMethodClient

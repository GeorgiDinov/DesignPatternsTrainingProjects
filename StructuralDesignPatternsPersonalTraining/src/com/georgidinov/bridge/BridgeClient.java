package com.georgidinov.bridge;

//The goal is to separate and decouple the dependency from
//the implementation on the abstraction
//Using composition the abstraction HAS A relationship with the implementor
//Again programing to an interface
//That decouples abstraction(abstract class Shape) and implementor(interface Color)
//Color is used in methods in Shape with the needed implementation(RedColor or GreenColor)
//We then can have both Rectangle and Triangle classes that are not forced by the Shape class
//to implement its abstraction but rather use the implementor(Color interface)
class BridgeClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Bridge Design Pattern>>>\n");

        System.out.println("Drawing rectangle: ");
        Shape rectangle = new Rectangle(new RedColor());
        rectangle.drawShape(50);
        rectangle.modifyBorder(50, 2);

        System.out.println();

        System.out.println("Drawing triangle: ");
        Shape triangle = new Triangle(new GreenColor());
        triangle.drawShape(20);
        triangle.modifyBorder(20, 3);

    }//end of main method

}//end of class BridgeClient

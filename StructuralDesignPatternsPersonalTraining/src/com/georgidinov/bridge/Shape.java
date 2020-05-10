package com.georgidinov.bridge;

//Abstraction
abstract class Shape {
    Color color;

    protected Shape(Color c) {
        this.color = c;
    }//end of constructor

    protected abstract void drawShape(int borderSize);

    protected abstract void modifyBorder(int borderSize, int multiplier);
}//end of abstract class Shape

class Rectangle extends Shape {

    public Rectangle(Color c) {
        super(c);
    }

    //Implementor specific method
    @Override
    protected void drawShape(int borderSize) {
        System.out.print("\tRectangle is drawn and ");
        color.fillWithColor(borderSize);
    }

    //Abstraction specific method
    @Override
    protected void modifyBorder(int borderSize, int multiplier) {
        System.out.println("\tNow we are modifying rectangle's border " + multiplier + " times.");
        borderSize *= multiplier;
        drawShape(borderSize);
    }

}//end of class Rectangle

class Triangle extends Shape {

    public Triangle(Color c) {
        super(c);
    }

    //Implementor specific method
    @Override
    protected void drawShape(int borderSize) {
        System.out.print("\tTriangle is drawn and ");
        color.fillWithColor(borderSize);
    }

    //Abstraction specific method
    @Override
    protected void modifyBorder(int borderSize, int multiplier) {
        System.out.println("\tNow we are modifying triangle's border " + multiplier + " times.");
        borderSize *= multiplier;
        drawShape(borderSize);
    }

}//end of class Rectangle
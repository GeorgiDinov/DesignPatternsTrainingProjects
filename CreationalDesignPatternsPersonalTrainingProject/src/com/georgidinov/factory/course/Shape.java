package com.georgidinov.factory.course;

//Programming to an interface principle, use the interface type to abstract

interface Shape {
    void draw();
}//end of interface Shape

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("\tInside Rectangle::draw() method.");
    }//end of method draw
}//end of class Rectangle

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("\tInside Circle::draw() method.");
    }//end of method draw
}//end of class Circle

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("\tInside Square::draw() method.");
    }//end of method draw
}//end of class Square

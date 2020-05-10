package com.georgidinov.abstractfactory.course;

interface AbstractFactoryShape {
    void draw();
}//edn fo interface AbstractFactoryInterface

class AbstractFactoryRectangle implements AbstractFactoryShape {
    @Override
    public void draw() {
        System.out.println("\tInside AbstractFactoryRectangle::draw() method.");
    }
}//end of class AbstractFactoryRectangle

class AbstractFactoryCircle implements AbstractFactoryShape {
    @Override
    public void draw() {
        System.out.println("\tInside AbstractFactoryCircle::draw() method.");
    }
}//end of class AbstractFactoryCircle

class AbstractFactorySquare implements AbstractFactoryShape {
    @Override
    public void draw() {
        System.out.println("\tInside AbstractFactorySquare::draw() method.");
    }
}//end of class AbstractFactorySquare
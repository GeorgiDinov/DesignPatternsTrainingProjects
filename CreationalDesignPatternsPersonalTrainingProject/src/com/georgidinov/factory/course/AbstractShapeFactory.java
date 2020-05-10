package com.georgidinov.factory.course;

//Also known as "abstract creator" approach but because of the inheritance is
//less used than the concrete creator
abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }//end of method getShape

}//end of abstract class AbstractShapeFactory

//
//Creating concrete factory classes again behind abstraction
//disadvantages of the strict implementation is that for every type we want
//to create we have to make new subclass of the AbstractFactoryClass
//other approach is to have method which accepts parameter and base of the parameter
//returns the right object
//
class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }//end of factoryMethod

}//end of class RectangleFactory

class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }//end of factoryMethod

}//end of class CircleFactory

class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }//end of factoryMethod

}//end of class SquareFactory
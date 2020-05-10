package com.georgidinov.abstractfactory.course;

//Here the Interface Segregation Principle is violated because
//the abstract class has "two purposes", and the concrete factory classes are forced
//to implement methods that won't use
//in package coursetwo there will be kind of avoidance with movie example
//Here I'm not using the strict way with subclassing rather the factory method with
//passed parameter, in the subclass(the strict way proposed by the "gang of four")
//way we'd to create factory class for every
//shape and color, and with the interface segregation principle violation total of 6 empty
//method stubs which is considered as code duplication
abstract class AbstractFactory {
    protected abstract AbstractFactoryShape getShape(String shapeType);

    protected abstract AbstractFactoryColor getColor(String colorType);
}//end of abstract class AbstractFactory

class ConcreteShapeFactory extends AbstractFactory {

    @Override
    protected AbstractFactoryShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new AbstractFactoryRectangle();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new AbstractFactoryCircle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new AbstractFactorySquare();
        }
        return null;
    }

    @Override
    protected AbstractFactoryColor getColor(String colorType) {
        return null;
    }
}//end of class ConcreteShapeFactory


class ConcreteColorFactory extends AbstractFactory {
    @Override
    protected AbstractFactoryShape getShape(String shapeType) {
        return null;
    }

    @Override
    protected AbstractFactoryColor getColor(String colorType) {
        if (colorType == null) {
            return null;
        } else if (colorType.equalsIgnoreCase("Red")) {
            return new AbstractFactoryRed();
        } else if (colorType.equalsIgnoreCase("Green")) {
            return new AbstractFactoryGreen();
        } else if (colorType.equalsIgnoreCase("Blue")) {
            return new AbstractFactoryBlue();
        }
        return null;
    }
}//end of class ConcreteColorFactory
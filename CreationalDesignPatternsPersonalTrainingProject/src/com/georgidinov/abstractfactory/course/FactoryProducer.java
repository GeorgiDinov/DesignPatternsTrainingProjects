package com.georgidinov.abstractfactory.course;

class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if (factory == null) {
            return null;
        } else if (factory.equalsIgnoreCase("Shape")) {
            return new ConcreteShapeFactory();
        } else if (factory.equalsIgnoreCase("Color")) {
            return new ConcreteColorFactory();
        }
        return null;
    }//end of method getFactory

}//end of class FactoryProducer

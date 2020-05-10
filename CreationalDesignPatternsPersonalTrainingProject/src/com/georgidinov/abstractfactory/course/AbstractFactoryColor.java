package com.georgidinov.abstractfactory.course;

interface AbstractFactoryColor {
    void fill();
}//edn of interface AbstractFactoryColor

class AbstractFactoryRed implements  AbstractFactoryColor{
    @Override
    public void fill() {
        System.out.println("\tInside AbstractFactoryRed::fill() method");
    }
}//end of class AbstractFactoryRed

class AbstractFactoryGreen implements  AbstractFactoryColor{
    @Override
    public void fill() {
        System.out.println("\tInside AbstractFactoryGreen::fill() method");
    }
}//end of class AbstractFactoryGreen

class AbstractFactoryBlue implements  AbstractFactoryColor{
    @Override
    public void fill() {
        System.out.println("\tInside AbstractFactoryBlue::fill() method");
    }
}//end of class AbstractFactoryBlue
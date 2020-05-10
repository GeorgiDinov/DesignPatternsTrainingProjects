package com.georgidinov.prototype.course;

//Three major approaches to copying objects
//First and probably most common using the Cloneable interface
//Second known as the "C++" commonly used way is with cloning(copy) constructor
//Third is with serialization and deserialization using the Serializable interface
//If the Cloneable interface is used we have to mind that this may produce
//shallow copy of the object
abstract class AbstractCar implements Cloneable {

    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public AbstractCar clone() throws CloneNotSupportedException {
        return (AbstractCar) super.clone();
    }//end of clone method

}//end of abstract class AbstractCar


//If subclasses have only primitive types for member variables and they are the same
//as the superclass one's there is no need to override the clone() method
//But if we have more fields we have to override the clone method
//If we have reference types different from arrays we have to make sure that they
//implement their own clone method, because maybe only the reference will be copied without
//the reference member variable data
class Ford extends AbstractCar {

    private int testVariable = 100;

    public Ford(String fordName, double fordPrice) {
        name = fordName;
        price = fordPrice;
    }//end of constructor

    @Override
    public Ford clone() {
        Ford clone = null;
        try {
            clone = (Ford) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;

    }//end of method clone

    public int getTestVariable() {
        return testVariable;
    }

}//end of class Ford

class Audi extends AbstractCar {
    public Audi(String audiName, double audiPrice) {
        name = audiName;
        price = audiPrice;
    }
}//end of class Audi

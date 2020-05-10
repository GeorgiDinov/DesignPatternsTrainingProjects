package com.georgidinov.prototype.course;

//Use Prototype design pattern when object creation is expensive, avoid "new"
//Overall get some common abstract class or interface among the products
//in this case class AbstractCar and it subclasses
//Figure out how you are going to copy your objects
//Cloneable, copy constructor or serialization deserialization(in memory or regular)
//Make class which is going to keep the objects you want to clone cashed
//Let the Client use the class with the cashed objects and retrieve the copies.
class PrototypeClient {

    public static void main(String[] args) {
        AbstractCarCashingClass.loadData();
        Ford fordCopy = null;
        try {
            AbstractCar ford = AbstractCarCashingClass.getClone("Ford");
            fordCopy = (Ford) ford.clone();
            AbstractCar audi = AbstractCarCashingClass.getClone("Audi");
            System.out.println("Clone of " + ford.getName() + " with price: " + ford.getPrice());
            System.out.println("Clone of " + audi.getName() + " with price: " + audi.getPrice());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure..." + e.getMessage());
        }

        System.out.println("Clone the clone = " + fordCopy.getName() + " price = " + fordCopy.getPrice() +
                " with extra field = " + fordCopy.getTestVariable());

    }//end of main method

}//end of class PrototypeClient

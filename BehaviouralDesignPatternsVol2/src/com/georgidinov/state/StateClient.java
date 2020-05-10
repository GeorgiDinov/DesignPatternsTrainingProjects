package com.georgidinov.state;

//
//State Design Pattern
//To ease the representation of different states of an object
//Instead of making it's fields(state) set or changed via complex if/else blocks
//we could represent each different state of the object with  "state object"
//make an interface or abstract class to define method/ methods that different
//state representation of the object will be used for from the client
//ensure reference of that interface in the Context class which state changes
//use the state object method polymorphic behavior to interact with the client
//and change state when needed with just passing the newly desired state as an object
//Participants:
//State Interface and it's concrete implementations
//Context class holding a State Interface reference(programing to an interface)
//Client who is using the context with the same methods but in different state/ different behavior.

class StateClient {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<State Design Pattern>>>\n");
        System.out.println("Initializing the context with Vibration object state.");
        MobilePhoneContext phone = new MobilePhoneContext(new Vibration());
        phone.ring();
        phone.ring();

        System.out.println("\nSetting the state to a Silent object state.");
        phone.setState(new Silent());
        phone.ring();
        phone.ring();

    }//end of main method

}//end of class StateClient

package com.georgidinov.mediator;

//Mediator Design Pattern
//Manage complex communication between objects
//make communication from "many to many" to "one to one"
//user will communicate with only one object - the mediator
//form there the mediator will disperse(redirect) the communication among objects
//Participants:
// Mediator
// Colleagues
// Colleagues interact with each other through the Mediator
// Mediator interface defines methods to add new colleague and send messages
// It holds list of all of the colleagues that are using it and its initialized in the constructor
// User(colleague) has name field and a Mediator reference both initialized in its constructor
//     When the user wants to send a message he forwards thew message to the mediator
//     (in the sendMessage()  method)
//      Then the mediator go through his list and resend the message for all other users(in our case
//      , we may have specific communication rules) by calling the User receiveMessage() on every
//      object in the list except the one that sent the message originally.
//
//
class MessageMediatorClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Mediator Design Pattern>>>\n");
        //create mediator
        MessageMediator mediator = new Mediator();

        //create users of that mediator
        AbstractUser user1 = new User(mediator, "John Doe");
        AbstractUser user2 = new User(mediator, "Jane Smith");
        AbstractUser user3 = new User(mediator, "Chuck Norris");

        //add the users to the mediator's list
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        //now when user sends a message every other users will receive it
        user1.sendMessage("Hi!");
        System.out.println("------------------");

        user2.sendMessage("Hello!");
        System.out.println("------------------");

        user3.sendMessage("Hay There!");
        System.out.println("------------------");
    }//end of main method

}//end of class MessageMediatorClient

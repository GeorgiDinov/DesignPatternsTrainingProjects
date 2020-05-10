package com.georgidinov.mediator;

class User extends AbstractUser {

    public User(MessageMediator mediator, String name) {
        super(mediator, name);
    }//end of constructor

    @Override
    protected void sendMessage(String message) {
        System.out.println(this.name + " sends message " + message+"\n");
        this.mediator.sendMessage(this, message);
    }//end of method sendMessage

    @Override
    protected void receiveMessage(String message) {
        System.out.println(this.name + " received message: " + message);
    }//end of method receivedMessage

}//end of class User

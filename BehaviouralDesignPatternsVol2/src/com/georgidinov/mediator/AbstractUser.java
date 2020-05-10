package com.georgidinov.mediator;

//this the "colleague" role
abstract class AbstractUser {

    protected MessageMediator mediator;
    protected String name;

    public AbstractUser(MessageMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }//end of constructor

    protected String getName() {
        return name;
    }

    protected abstract void sendMessage(String message);

    protected abstract void receiveMessage(String message);

}//end of class AbstractUser

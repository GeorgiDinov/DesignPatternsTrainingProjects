package com.georgidinov.mediator;

interface MessageMediator {

    void addUser(AbstractUser user);

    void sendMessage(AbstractUser user, String message);

}//end of interface MessageMediator



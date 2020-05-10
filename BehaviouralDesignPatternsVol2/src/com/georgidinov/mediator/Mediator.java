package com.georgidinov.mediator;

import java.util.ArrayList;
import java.util.List;

class Mediator implements MessageMediator {

    private final List<AbstractUser> users;

    public Mediator() {
        this.users = new ArrayList<>();
    }//end of constructor

    @Override
    public void addUser(AbstractUser user) {
        this.users.add(user);
    }//end of method addUser

    @Override
    public void sendMessage(AbstractUser user, String message) {
        for (AbstractUser abstractUser : this.users) {
            if (abstractUser != user) {
                abstractUser.receiveMessage(message);
            }
        }
    }//end of method sendMessage

}//end of class Mediator

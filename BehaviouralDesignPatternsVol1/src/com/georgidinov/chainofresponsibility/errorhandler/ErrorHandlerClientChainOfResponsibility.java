package com.georgidinov.chainofresponsibility.errorhandler;


//In this pattern the client is responsible of creating the chain
//Either in its constructor or in this case in the main method
class ErrorHandlerClientChainOfResponsibility {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Chain Of Responsibility Design Pattern>>>\n");

        //initializing the error event handlers
        MyErrorHandler firstInChain = new FaxErrorHandler();
        MyErrorHandler secondInChain = new EmailErrorHandler();

        //build the chain
        firstInChain.setNextErrorHandlerInChain(secondInChain);

        //making some message objects
        Message msg1 = new Message("Fax is reaching late to the destination",
                MessagePriority.NORMAL);
        Message msg2 = new Message("Email is not going",
                MessagePriority.HIGH);
        Message msg3 = new Message("In Email, BCC is disabled occasionally",
                MessagePriority.NORMAL);
        Message msg4 = new Message("Fax is not reaching destination",
                MessagePriority.HIGH);

        //creating instance of our helper class to forward the messages through the chain
        //passing the first handler in our chain
        IssueRaiser issueRaiser = new IssueRaiser(firstInChain);

        //passing out the messages to be handled from "someone"(we don't know who)
        issueRaiser.raiseMessage(msg1);
        issueRaiser.raiseMessage(msg2);
        issueRaiser.raiseMessage(msg3);
        issueRaiser.raiseMessage(msg4);

    }//end of main method

}//end of class ErrorHandlerClientChainOfResponsibility

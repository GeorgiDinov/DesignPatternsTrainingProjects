package com.georgidinov.chainofresponsibility.errorhandler;

class IssueRaiser {

    private final MyErrorHandler errorHandler;

    public IssueRaiser(MyErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }//end of constructor

    public void raiseMessage(Message message) {
        if (this.errorHandler != null) {
            this.errorHandler.processMessage(message);
        }
    }//end of method raiseMessage

}//end of class IssueRaiser

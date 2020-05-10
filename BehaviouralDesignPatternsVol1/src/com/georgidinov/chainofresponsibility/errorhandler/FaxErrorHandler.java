package com.georgidinov.chainofresponsibility.errorhandler;

//first in chain
class FaxErrorHandler implements MyErrorHandler {

    private MyErrorHandler nextInChain;

    @Override
    public void setNextErrorHandlerInChain(MyErrorHandler handler) {
        this.nextInChain = handler;
    }//end of method setNextErrorHandlerInChain

    @Override
    public boolean processMessage(Message message) {
        if (message.getText().contains("Fax")) {
            System.out.println(this.getClass().getSimpleName() +
                    " processed " + message.getPriority() +
                    " issue: " + message.getText());
            return true;
        } else if (this.nextInChain != null) {
            this.nextInChain.processMessage(message);
        }
        return false;

    }//end of method processMessage

}//end of class FaxErrorHandler

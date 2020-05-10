package com.georgidinov.chainofresponsibility.errorhandler;

//second in chain
class EmailErrorHandler implements MyErrorHandler {

    private MyErrorHandler nextInChain;

    @Override
    public void setNextErrorHandlerInChain(MyErrorHandler handler) {
        this.nextInChain = handler;
    }//end of method setNextErrorHandlerInChain

    @Override
    public boolean processMessage(Message message) {
        if (message.getText().contains("Email")) {
            System.out.println(this.getClass().getSimpleName() +
                    " processed " + message.getPriority() +
                    " issue: " + message.getText());
            return true;
        } else if (this.nextInChain != null) {
            return this.nextInChain.processMessage(message);
        }
        return false;

    }//end of method processMessage

}//end of class EmailErrorHandler

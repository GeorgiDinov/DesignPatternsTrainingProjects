package com.georgidinov.chainofresponsibility.errorhandler;

interface MyErrorHandler {

    void setNextErrorHandlerInChain(MyErrorHandler handler);

    boolean processMessage(Message message);

}//end of interface MyErrorHandler

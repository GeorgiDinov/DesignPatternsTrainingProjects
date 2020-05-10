package com.georgidinov.chainofresponsibility.errorhandler;

class Message {

    private final String text;
    private final MessagePriority priority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }//end of constructor

    public String getText() {
        return text;
    }//end of method getText

    public String getPriority() {
        return priority.getPriority();
    }//end of method getPriority

}//end of class Message

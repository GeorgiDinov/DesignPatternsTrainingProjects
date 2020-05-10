package com.georgidinov.chainofresponsibility.errorhandler;

enum MessagePriority {

    HIGH("High Priority"), NORMAL("Normal Priority");

    private final String priority;

    MessagePriority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }//end of method getPriority

}//end of enum MessagePriority

package com.georgidinov.interpreter;

class InterpreterContext {

    private final String data;

    public InterpreterContext(String data) {
        this.data = data;
    }//end of constructor

    public boolean getResult(String input) {
        return this.data.contains(input);
    }//end of method getResult

}//end of class InterpreterContext

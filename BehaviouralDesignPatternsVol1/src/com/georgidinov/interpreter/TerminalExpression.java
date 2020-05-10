package com.georgidinov.interpreter;

class TerminalExpression implements Expression {
    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }//end of constructor

    @Override
    public boolean interpret(InterpreterContext context) {
        return context.getResult(this.data);
    }//end of method interpret

} //end of class TerminalExpression

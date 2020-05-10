package com.georgidinov.interpreter;

class ANDNonTerminalExpression implements Expression {

    private Expression expressionOne;
    private Expression expressionTwo;

    public ANDNonTerminalExpression(Expression expressionOne,
                                    Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }//end of constructor

    @Override
    public boolean interpret(InterpreterContext context) {
        return expressionOne.interpret(context) && expressionTwo.interpret(context);
    }//end of method interpret

}//end of class ANDNonTerminalExpression

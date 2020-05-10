package com.georgidinov.interpreter;

class ORNonTerminalExpression implements Expression {
    private Expression expressionOne;
    private Expression expressionTwo;

    public ORNonTerminalExpression(Expression expressionOne,
                                   Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }//end of constructor

    @Override
    public boolean interpret(InterpreterContext context) {
        return expressionOne.interpret(context) || expressionTwo.interpret(context);
    }//end of method interpret

}//end of class ORNonTerminalExpression

package com.georgidinov.interpreter;

//
//Interpreter Design Pattern
//So far this is the pattern that is hard to understand, because of the
//strange explanations from the instructor, further knowledge on the pattern is required
//Briefly use it for Natural Language Processing (NLP), interpretation, partial use
//in small compilers and translators
//it can handle small grammars
//This whole example is strange for because the instructor talks about
//terminal and non-terminal expressions suppose to symbols
//I couldn't really catch the idea behind the example
//I do understand the structure of the pattern
//So here it is
//We have global interpreter (InterpreterContext class)
//this class has method that recognizes if given expression is valid for our grammar
//The Expression interface with one method interpret() takes InterpreterContext as a
//parameter
//TerminalExpression class implements the Expression interface
//It holds one String member variable initialized in its constructor
//and in the interpret method the context object check if the value matches with the value stored in
//the context member variable
//NonTerminal Expression classes they play like evaluation of OR and AND operators expressions
//which are checked accordingly with the context object
// They take two Expression objects
// (TerminalExpression objects, I tend to use "The Program To An Interface Principle)
// and perform
//logical operators "&&" and "||" on the returned value of the context getResult() method
//which happens to be their return expression check
//
//  The client pretty much builds the abstract syntax tree
//perform evaluations on NON Terminal Expressions to Terminal One's
//again it is strange a bit, maybe it is more like a regular expression matching kind of thing
//
//------------I don't know even how this grammar will look like
//
//  TerminalExpression = { A-z }.
//  NONTerminalExpression = [TerminalExpression && TerminalExpression] |
//      [TerminalExpression | TerminalExpression].
//  Expression = TerminalExpression | NONTerminalExpression.
//
//Mind that I'm using "&&" operator inappropriately and the EBNF not very accurately
//This will be under  further researches
//
class InterpreterClient {

    private static Expression getANDForMarriageExpression() {
        Expression jason = new TerminalExpression("Jason");
        Expression married = new TerminalExpression("Married");
        return new ANDNonTerminalExpression(jason, married);
    }//end of method getANDForMarriageExpression

    private static Expression getORForFemaleExpression() {
        Expression lucy = new TerminalExpression("Lucy");
        Expression mary = new TerminalExpression("Mary");
        return new ORNonTerminalExpression(lucy, mary);
    }//end of method getORForFemaleExpression

    public static void main(String[] args) {
        //
        System.out.println("\n\t\t\t<<<Interpreter Design Pattern>>>");
        //
        System.out.println("\n\t\t\t\t\t<<<AND EXPRESSION>>>");
        Expression andExpression = getANDForMarriageExpression();
        InterpreterContext jasonMarried = new InterpreterContext("JasonMarried");
        System.out.print("Is Both Jason *AND* Married true For Context \"JasonMarried\": ");
        System.out.println(andExpression.interpret(jasonMarried));
        //
        //
        System.out.println("\n\t\t\t\t\t<<<OR EXPRESSION>>>");
        Expression orExpression = getORForFemaleExpression();
        InterpreterContext lucyFemale = new InterpreterContext("Lucy");
        InterpreterContext maryFemale = new InterpreterContext("Mary");
        InterpreterContext females = new InterpreterContext("MaryLucy");
        System.out.print("Is One Of Lucy *OR* Mary true To Be Female For Context \"Lucy\": ");
        System.out.println(orExpression.interpret(lucyFemale));
        System.out.print("Is One Of Lucy *OR* Mary true To Be Female For Context \"Mary\": ");
        System.out.println(orExpression.interpret(maryFemale));
        System.out.print("Is One Of Lucy *OR* Mary true To Be Female For Context \"MaryLucy\": ");
        System.out.println(orExpression.interpret(females));
        //
        //
        System.out.print("\nSingle Expression test If Jason Is true To Be Female For Context \"MaryLucy\": ");
        Expression jason = new TerminalExpression("Jason");
        System.out.println(jason.interpret(females));

    }//end of main method

}//end of class InterpreterClient

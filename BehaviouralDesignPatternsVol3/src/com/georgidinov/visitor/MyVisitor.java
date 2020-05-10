package com.georgidinov.visitor;

interface MyVisitor {

    void visit(Book book);

    void visit(Perfume perfume);

    double getCost();

}//end of interface MyVisitor

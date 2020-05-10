package com.georgidinov.visitor;

class NationalPostServiceVisitor implements MyVisitor {

    private double costOfTransportation = 0d;

    @Override
    public void visit(Book book) {
        this.costOfTransportation += (book.getWeight() * 1.5d);
    }//end of method visit on Book

    @Override
    public void visit(Perfume perfume) {
        this.costOfTransportation += (perfume.getWeight() * 1.2d);
    }//end of method visit on Perfume

    @Override
    public double getCost() {
        return this.costOfTransportation;
    }//end of method getCost

}//end of class NationalPostServiceVisitor

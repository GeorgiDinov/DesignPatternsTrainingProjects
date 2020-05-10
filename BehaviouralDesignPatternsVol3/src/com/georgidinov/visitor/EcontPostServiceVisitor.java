package com.georgidinov.visitor;

class EcontPostServiceVisitor implements MyVisitor {

    private double costOfTransportation = 0d;

    @Override
    public void visit(Book book) {
        this.costOfTransportation += (book.getWeight() * 3d);
    }//end of method visit on Book

    @Override
    public void visit(Perfume perfume) {
        this.costOfTransportation += (perfume.getWeight() * 2d);
    }//end of method visit on Perfume

    @Override
    public double getCost() {
        return this.costOfTransportation;
    }//end of method getCost

}//end of class EcontPostServiceVisitor

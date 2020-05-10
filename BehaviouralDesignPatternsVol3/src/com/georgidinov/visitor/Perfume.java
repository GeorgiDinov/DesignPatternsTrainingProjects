package com.georgidinov.visitor;

class Perfume implements MyElement {

    private final String brand;
    private final int packing;
    private final double weight;

    public Perfume(String brand, int packing, double weight) {
        this.brand = brand;
        this.packing = packing;
        this.weight = weight;
    }//end of constructor

    public String getBrand() {
        return brand;
    }//end of method getBrand

    public int getPacking() {
        return packing;
    }//end of method getPacking

    public double getWeight() {
        return weight;
    }//end of method getWeight

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }//end of method accept

}//end of class Perfume

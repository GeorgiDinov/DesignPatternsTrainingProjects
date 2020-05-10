package com.georgidinov.visitor;

class Book implements MyElement {

    private final String title;
    private final String ibfn;
    private final double weight;

    public Book(String title, String ibfn, double weight) {
        this.title = title;
        this.ibfn = ibfn;
        this.weight = weight;
    }//end of constructor

    public String getTitle() {
        return title;
    }//end of method getTitle

    public String getIbfn() {
        return ibfn;
    }//end of method getIbnf

    public double getWeight() {
        return weight;
    }//end of method getWeight

    @Override
    public void accept(MyVisitor visitor) {
            visitor.visit(this);
    }//end of method accept

}//end of class Book

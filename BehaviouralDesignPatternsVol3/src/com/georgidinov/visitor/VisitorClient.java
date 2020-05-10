package com.georgidinov.visitor;


//Visitor Design Pattern
//When you have a structure of objects and you want to extend their functionality
//without touching the objects, nor the structure we can apply the Visitor Design Pattern
//So the class who holds the objects may not have method for calculating like in our case
//price for something based on some object property of the Elements(objects) this object holds
//this may not be the one thing we want to do to extend our functionality
//and the Element holding object may become complex and dependable
//Here we "Program to an Interface" with both interfaces Element and Visitor
//We maintain the "Open Closed Principle" (open for extension, closed for modification)
//So the Elements may be different but if they Implement the Element interface with the
//--------accept(Visitor) method and pass itself to the Visitor visit(Element) method
//the Visitor will extend the functionality of that object by performing some operations
//In our example we have two not very related objects, but they implement the Element interface
// and accept Visitor/s , then in the Visitor interface we have overloaded visit methods
//that accept as parameters each of the concrete objects that implement the Element interface
//
//>>>while traversing through we call the accept method on every object and the right
//visit method gets executed
//
//We can easily extend the number of concrete visitors,
// and the objects to be visited(programing to an interface)
//
class VisitorClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Visitor Design Pattern>>>\n");
        System.out.println("\tTraversing a list of Elements and Visit each element to calculate" +
                "\npost service of different postal companies(Visitors)");

        MyElement[] elements = new MyElement[]{
                new Book("To Chicago And Back", "1234", 1.2d),
                new Perfume("D&G", 100, 0.2),
                new Perfume("Pacco Raban", 50, 0.1d),
                new Book("The Decapitated Horsemen", "5678", 2d)
        };

        double econtPrice = calculatePostService(elements, new EcontPostServiceVisitor());
        double nationalPostPrice = calculatePostService(elements, new NationalPostServiceVisitor());

        System.out.println("\n\tDisplaying Results Of Visiting Each Element From Both Visitors" +
                "\nAnd Their Different Calculations On The Transportation Price:\n");
        System.out.println("\tEcont calculated total of " +
                String.format("%.2f", econtPrice) + " leva.");
        System.out.println("\tBulgarian Post calculated total of " +
                String.format("%.2f", nationalPostPrice) + " leva.");


    }//end of main method

    private static double calculatePostService(MyElement[] elements, MyVisitor visitor) {
        for (MyElement element : elements) {
            element.accept(visitor);
        }
        return visitor.getCost();
    }//end of method calculatePostService

}//end of class VisitorClient

package com.georgidinov.composite;

//The idea is to represent group of similar objects as one
//Define component interface and classes which will implement it are either Leafs(no children) or
//Composite(with children) -> I am using tree like representation
//The idea is that the client that uses the component interface can interact with Leaf of Composite object
//in the same way
//In this implementation of the pattern there is slightly different approach of the primary option
//Because there will be "trade off's" in the "original" variation the interface will have to define methods
//for add, get, remove and some other common operations
//but classes implementing the interface which are Leafs won't use at least add, get and remove operations
//this violates two principles "The interface segregation principle" and "The single responsibility principle"
//in our implementation we kind of force the client to know a bit more of the composite class(class Supervisor)
//and all of the methods for the add, remove and delete operations are defined and implemented in it
//so the client has to know more about the composite class which will make things more coupled
class CompositeClient {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Composite Design Pattern>>>\n");

        //top of the represented hierarchy -> composite node
        Supervisor dean = new Supervisor("prof. d-r A.Golev", "Dean Of FMI");

        //one level bellow still composite node
        Supervisor mathDepartmentChief = new Supervisor("doc. d-r H. Kiskinov", "Math Analysis Department Chief");
        Supervisor softTechDepartmentChief = new Supervisor("doc. d-r A. Stoqnova", "Software Systems Department Chief");

        //all of the professors are leaf nodes
        Professor mathProfessor1 = new Professor("as. I. Gradeva", "Assistant", "+359-00");
        Professor mathProfessor2 = new Professor("doc. d-r T. Peneva", "Associate Professor", "+359-01");

        Professor softProfessor1 = new Professor("prof. d-r S. Stoqnov", "Professor", "+359-20");
        Professor softProfessor2 = new Professor("prof. d-r I. Ganchev", "Professor", "+359-21");
        Professor softProfessor3 = new Professor("doc. d-r D. Dimov", "Associate Professor", "+359-22");

        //creating the hierarchy
        dean.add(mathDepartmentChief);
        dean.add(softTechDepartmentChief);

        //next level
        //under mathDepartmentChief
        mathDepartmentChief.add(mathProfessor1);
        mathDepartmentChief.add(mathProfessor2);

        //under softDepartmentChief
        softTechDepartmentChief.add(softProfessor1);
        softTechDepartmentChief.add(softProfessor2);
        softTechDepartmentChief.add(softProfessor3);

        //printing out the hierarchy tabulating each level
        System.out.println(dean.getDetails());
        for (Faculty faculty : dean.getMyFaculties()) {
            System.out.println("\t" + faculty.getDetails());
        }
        System.out.println("\n\t\t\tDepartment of Mathematical Analysis:");
        for (Faculty faculty : mathDepartmentChief.getMyFaculties()) {
            System.out.println("\t\t\t" + faculty.getDetails());
        }
        System.out.println("\n\t\t\tDepartment of Software Systems:");
        for (Faculty faculty : softTechDepartmentChief.getMyFaculties()) {
            System.out.println("\t\t\t" + faculty.getDetails());
        }

    }//end of main method

}//end of class CompositeClient

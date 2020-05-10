package com.georgidinov.memento.single;


//  Memento Design Pattern
//Single state(memento) implementation
//Used for restoring previous states / state of an object
//Not recommended if this is heavy and memory consuming operation
//
//  Participants: Originator, Memento, Caretaker
//
//->Originator is the object which state we want so save / store
//-->Memento is the object that is storing the Originator state
//      in this example the Memento is an inner class
//--->Caretaker is the object which handles the Memento object / objects
//  the Caretaker, does not modify the memento object / objects he is just passing them around
//  It holds object reference to the saved memento or entire list / stack
//  of memento objects(states of the Originator)
//two methods that take Originator object as a parameter
//one for storing the current state, one for restoring state
//with the stacked example will see method which can restore specific states
//->The Originator also has two methods one to create his Memento and one
// that takes a Memento object and use to restore it's state
//
class SingleMementoClient {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Memento Design Pattern>>>\n");

        try {
            //creating the Originator
            SingleMementoOriginator originator = new SingleMementoOriginator("file.txt");
            System.out.println("Originator object created... adding content(state) to the object...");
            Thread.sleep(3000);
            originator.writeContent("State # 1");
            System.out.println("\n\tOriginator current state(content) is NOW <{" + originator + "}>\n");

            Thread.sleep(3000);
            //crating the Caretaker
            System.out.println("Saving current state...");
            SingleMementoCaretaker caretaker = new SingleMementoCaretaker();
            caretaker.save(originator);

            Thread.sleep(3000);
            //adding additional content
            System.out.println("\nModifying the content(state) of the originator object...");
            Thread.sleep(3000);
            originator.writeContent(" MODIFIED!");
            System.out.println("\n\tOriginator current state(content) is NOW <{" + originator + "}>\n");

            Thread.sleep(3000);
            //restoring to previous state
            System.out.println("\nRestoring originator to it's previous state(content)...");
            Thread.sleep(3000);
            caretaker.restore(originator);
            System.out.println("\n\tOriginator current state(content) is NOW <{" + originator + "}>\n");

        } catch (InterruptedException e) {
            e.getMessage();
        }//end of tryCatch

    }//end of main method

}//end of class SingleMementoClient

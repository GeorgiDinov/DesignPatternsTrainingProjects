package com.georgidinov.memento.stacked;

import java.util.LinkedList;

class Caretaker {

    private final LinkedList<Object> mementos;

    public Caretaker() {
        this.mementos = new LinkedList<>();
    }//end of constructor

    public void save(Originator originator) {
        this.mementos.addLast(originator.save());
    }//end of method save

    //restores backwards like stack, but I'm not using this
    //feature of the linked list because of the indices
    //here the top of the stack is the back of the list
    public void restore(Originator originator) {
        if (!this.mementos.isEmpty()) {
            originator.restore(this.mementos.removeLast());
        }
    }//end of method restore


    //restoring specific state with the help of index
    //first saved state will be at position 0 and from that point onward
    //if I've used the list stack capabilities we had check the first state as size()-1
    //and so forth
    public void restoreSpecificState(Originator originator, int state) {
        if (!this.mementos.isEmpty() && state < this.mementos.size()) {
            originator.restore(this.mementos.get(state));
        }
    }//end of method restoreSpecificState

}//end of class Caretaker

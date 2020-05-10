package com.georgidinov.memento.single;

class SingleMementoCaretaker {

    private Object object;

    public SingleMementoCaretaker() {
        this.object = null;
    }//end of constructor

    public void save(SingleMementoOriginator originator) {
        this.object = originator.save();
    }//end of method save;

    public void restore(SingleMementoOriginator originator) {
        originator.restore(this.object);
    }//end of method restore

}//end of class SingleMementoCaretaker

package com.georgidinov.iterator.subjects;

class ArtsIterator implements TheIterator {

    private final Subject[] iteratorSubjects;
    private Subject currentSubject;
    private int index;

    public ArtsIterator(Subject[] iteratorSubjects) {
        this.iteratorSubjects = iteratorSubjects;
        this.currentSubject = null;
        this.index = 0;
    }//end of constructor

    @Override
    public void first() {
        //this.index = 0;
        this.currentSubject = this.iteratorSubjects[0];
    }//end of method first

    @Override
    public Subject next() {
        //return this.iteratorSubjects[this.index++];
        currentSubject = this.iteratorSubjects[this.index++];
        return currentSubject;
    }//end of method next

    @Override
    public boolean isDone() {
        return this.index != this.iteratorSubjects.length &&
                this.iteratorSubjects[this.index] != null;
    }//end of method isDone

    @Override
    public Subject currentItem() {
        //return this.iteratorSubjects[this.index];
        return this.currentSubject;
    }//end of method currentSubject

}//end of class ArtsIterator

package com.georgidinov.iterator.subjects;

import java.util.LinkedList;

class ScienceIterator implements TheIterator {

    private final LinkedList<Subject> iteratorSubjects;
    private Subject currentSubject;
    private int index;

    public ScienceIterator(LinkedList<Subject> iteratorSubjects) {
        this.iteratorSubjects = iteratorSubjects;
        this.currentSubject = null;
        this.index = 0;
    }//end of constructor

    @Override
    public void first() {
        this.currentSubject = this.iteratorSubjects.peekFirst();
    }//end of method first

    @Override
    public Subject next() {
        this.currentSubject = this.iteratorSubjects.get(this.index++);
        return this.currentSubject;
    }//end of method next();

    @Override
    public boolean isDone() {
        return this.index != this.iteratorSubjects.size();
    }//end of method isDone

    @Override
    public Subject currentItem() {
        return this.currentSubject;
    }//end of method currentItem

}//end of class ScienceIterator


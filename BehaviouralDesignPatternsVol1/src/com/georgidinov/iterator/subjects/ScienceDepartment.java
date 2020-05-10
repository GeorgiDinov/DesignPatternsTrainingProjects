package com.georgidinov.iterator.subjects;

import java.util.LinkedList;

class ScienceDepartment implements TheCollection {

    private final LinkedList<Subject> subjects;

    public ScienceDepartment() {
        this.subjects = new LinkedList<>();
    }//end of constructor

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }//end of method addSubject

    public Subject remove() {
        return this.subjects.remove();
    }//end of method remove

    public Subject firstSubject() {
        return this.subjects.peek();
    }//end of method peek

    //for ease of testing
    public void loadSubjects() {
        this.addSubject(new Subject("Math"));
        this.addSubject(new Subject("Computer Science"));
        this.addSubject(new Subject("Design Patterns"));
        this.addSubject(new Subject("Data Structures"));
    }//end of method loadSubjects

    @Override
    public TheIterator getIterator() {
        return new ScienceIterator(this.subjects);
    }//end of method getIterator

}//end of class ScienceDepartment

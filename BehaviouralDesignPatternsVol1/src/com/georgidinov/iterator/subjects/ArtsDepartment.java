package com.georgidinov.iterator.subjects;

class ArtsDepartment implements TheCollection {

    private Subject[] subjects;
    private int last;

    public ArtsDepartment() {
        this.subjects = new Subject[10];
        this.last = 0;
    }//end of constructor

    public void addSubject(Subject subject) {
        if (this.last == this.subjects.length) {
            Subject[] replacingCollection = new Subject[2 * this.subjects.length];
            System.arraycopy(this.subjects, 0, replacingCollection, 0, this.last);
            this.subjects = replacingCollection;
        }
        this.subjects[this.last++] = subject;
    }//end of method addSubject

    public Subject remove() {
        if (this.last == 0) {
            throw new IndexOutOfBoundsException("Collection is empty!");
        }
        Subject removedSubject = this.subjects[this.last - 1];
        this.subjects[this.last - 1] = null;
        this.last--;
        return removedSubject;
    }//end of removed subject

    public Subject firstSubject() {
        if (this.last == 0) {
            throw new IndexOutOfBoundsException("Collection is empty!");
        }
        return this.subjects[0];
    }//end of method firstSubject

    //for ease of testing
    public void loadSubjects() {
        this.addSubject(new Subject("Painting"));
        this.addSubject(new Subject("Sculpturing"));
        this.addSubject(new Subject("Graphical Design"));
        this.addSubject(new Subject("Calligraphy"));
    }//end of method loadSubjects

    @Override
    public TheIterator getIterator() {
        return new ArtsIterator(this.subjects);
    }//end of method getIterator

}//end of class ArtsDepartment

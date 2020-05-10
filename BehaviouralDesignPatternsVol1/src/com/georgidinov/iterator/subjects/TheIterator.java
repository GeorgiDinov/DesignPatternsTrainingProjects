package com.georgidinov.iterator.subjects;

interface TheIterator {

    void first();           //reset to first element

    Subject next();         //get next element

    boolean isDone();       //end of collection check

    Subject currentItem();  //retrieve current item

}//end of interface TheIterator

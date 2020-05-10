package com.georgidinov.iterator.notifications;

interface MyIterator {
    //indicates if there are more elements to iterate over
    boolean hasNext();

    //returns the next element
    Object next();
}//end of interface MyIterator

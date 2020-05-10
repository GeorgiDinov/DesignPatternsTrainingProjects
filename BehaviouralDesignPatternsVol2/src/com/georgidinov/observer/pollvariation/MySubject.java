package com.georgidinov.observer.pollvariation;

interface MySubject {

    void subscribe(MyObserver observer);

    void unsubscribe(MyObserver observer);

    void notifyMyObservers();

    //method for the poll operation
    String getUpdate(MyObserver observer);

}//end of interface MySubject

package com.georgidinov.observer.pushvariation;

interface MySubject {

    void subscribe(MyObserver observer);

    void unsubscribe(MyObserver observer);

    void notifyMyObservers();

}//end of interface MySubject

package com.georgidinov.observer.pollvariation;

interface MyObserver {
    void update();

    void setSubject(MySubject subject);
}//end of interface MyObserver

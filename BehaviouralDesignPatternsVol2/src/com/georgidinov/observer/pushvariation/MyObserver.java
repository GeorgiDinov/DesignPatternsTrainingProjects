package com.georgidinov.observer.pushvariation;

interface MyObserver {

    //you could pass the whole Subject object, also
    //concrete Observers may hold reference to the subject
    //for poll operations, that can be done without the Subject reference also
    //here we will pass only the state that we are interested in and that is the
    // String content
    void update(String content);

}//end of interface MyObserver

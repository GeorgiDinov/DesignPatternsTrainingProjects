package com.georgidinov.observer.pushvariation;

import java.util.ArrayList;
import java.util.List;

class BlogPoster implements MySubject {

    private List<MyObserver> myObservers;
    private String content;
    private boolean isChanged;

    public BlogPoster() {
        this.myObservers = new ArrayList<>();
        this.content = null;
        this.isChanged = false;
    }//end of constructor

    @Override
    public void subscribe(MyObserver observer) {
        if (this.isLegit(observer) && !this.myObservers.contains(observer)) {
            this.myObservers.add(observer);
            System.out.println(observer.getClass().getSimpleName() +
                    " is now SUBSCRIBED to the " +
                    this.getClass().getSimpleName());
        } else {
            System.out.println("Failure To SUBSCRIBE!");
        }
    }//end of method subscribe

    @Override
    public void unsubscribe(MyObserver observer) {
        if (this.isLegit(observer)) {
            this.myObservers.remove(observer);
            System.out.println(observer.getClass().getSimpleName() +
                    " is now UNSUBSCRIBED from the " +
                    this.getClass().getSimpleName());
        } else {
            System.out.println("Failure To UNSUBSCRIBE!");
        }
    }//end of method unsubscribe

    @Override
    public void notifyMyObservers() {
        if (this.isChanged) {
            this.isChanged = false;
            List<MyObserver> tempObserverList = new ArrayList<>(this.myObservers);
            for (MyObserver observer : tempObserverList) {
                observer.update(this.content);
            }
        }
    }//end of method notifyMyObservers


    public void releaseNewContent(String text) {
        if (text != null) {
            this.content = text;
            this.isChanged = true;
            this.notifyMyObservers();
        } else {
            System.out.println("Notification Failure!");
        }
    }//end of method releaseNewContent

    private boolean isLegit(MyObserver observer) {
        return observer != null;
    }//end of method isLegit


}//end of class BlogPoster

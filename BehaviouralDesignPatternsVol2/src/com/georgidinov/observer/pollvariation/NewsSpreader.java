package com.georgidinov.observer.pollvariation;

import java.util.ArrayList;
import java.util.List;

class NewsSpreader implements MySubject {

    private final List<MyObserver> mySubscribers;
    private String content;
    private boolean isChanged;

    public NewsSpreader() {
        this.mySubscribers = new ArrayList<>();
        this.content = null;
        this.isChanged = false;
    }//end of constructor


    @Override
    public void subscribe(MyObserver observer) {
        if (this.isLegit(observer) && !this.mySubscribers.contains(observer)) {
            this.mySubscribers.add(observer);
            System.out.println("Successfully Subscribed For " + this.getClass().getSimpleName());
        } else {
            System.out.println("Failure To Subscribe For " + this.getClass().getSimpleName());
        }
    }//end of method subscribe

    @Override
    public void unsubscribe(MyObserver observer) {
        if (this.isLegit(observer)) {
            this.mySubscribers.remove(observer);
            System.out.println("Successfully Unsubscribed From " + this.getClass().getSimpleName());
        } else {
            System.out.println("Failure To Unsubscribe From " + this.getClass().getSimpleName());
        }
    }//end of method unsubscribe

    @Override
    public void notifyMyObservers() {
        if (this.isChanged) {
            this.isChanged = false;
            List<MyObserver> tempSubscribersList = new ArrayList<>(this.mySubscribers);
            for (MyObserver observer : tempSubscribersList) {
                observer.update();
            }
        }
    }//end of method notifyMyObservers

    @Override
    public String getUpdate(MyObserver observer) {
        if (this.isLegit(observer) &&
                this.mySubscribers.contains(observer)) {
            return this.content;
        }
        return null;
    }//end of method getUpdate

    //method for triggering the notification
    public void spreadNews(String news) {
        if (news != null) {
            this.content = news;
            this.isChanged = true;
            this.notifyMyObservers();
        }
    }//end of spreadNews

    private boolean isLegit(MyObserver observer) {
        return observer != null;
    }//end of method isLegit

}//end of class NewsSpreader

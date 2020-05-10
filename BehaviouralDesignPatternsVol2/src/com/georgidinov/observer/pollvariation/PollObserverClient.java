package com.georgidinov.observer.pollvariation;

class PollObserverClient {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<Observer Design Pattern Poll Variation>>>\n");

        //creating subject and observer
        NewsSpreader subject = new NewsSpreader();
        NewsSubscriber subscriber = new NewsSubscriber();

        System.out.println("Subscribing observer to the subject");
        subject.subscribe(subscriber);
        subscriber.setSubject(subject);
        System.out.println("Triggering notification");
        subject.spreadNews("These are the latest news.");


    }//end of main method

}//end of class PollObserverClient

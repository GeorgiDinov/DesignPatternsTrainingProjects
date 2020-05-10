package com.georgidinov.observer.pushvariation;

class PushObserverClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Observer Design Pattern Push Variation>>>\n");
        //creating the subject
        //Note that I am not using the Subject interface, because there isn't defined
        //method for triggering the notification cycle in it
        BlogPoster blogPoster = new BlogPoster();

        //creating the Observers
        MyObserver blogObserver = new BlogObserver();
        MyObserver anotherBlogObserver = new AnotherBlogObserver();

        //subscribe to the Subject
        blogPoster.subscribe(blogObserver);
        blogPoster.subscribe(anotherBlogObserver);
        System.out.println();

        //triggering notification
        blogPoster.releaseNewContent("New Content Has Been Released!");

        System.out.println("\nUnsubscribing blogObserver and triggering again.");
        //unsubscribing blogObserver
        blogPoster.unsubscribe(blogObserver);
        System.out.println();
        //trigger notification
        blogPoster.releaseNewContent("Latest blog content is now available!");


    }//end of main method

}//end of class PushObserverClient

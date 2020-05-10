package com.georgidinov.iterator.notifications;

class NotificationCollection implements TheCollection {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationList;

    public NotificationCollection() {
        this.notificationList = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }//end of constructor

    private void addItem(String s) {
        Notification notification = new Notification(s);
        if (this.numberOfItems >= MAX_ITEMS) {
            System.out.println("Full!");
        } else {
            this.notificationList[numberOfItems++] = notification;
        }
    }//end of method addItem

    @Override
    public MyIterator createIterator() {
        return new NotificationIterator(this.notificationList);
    }//end of method createIterator

}//end of class NotificationCollection

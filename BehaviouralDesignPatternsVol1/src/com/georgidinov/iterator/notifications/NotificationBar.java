package com.georgidinov.iterator.notifications;

//Contains collection of notifications as an object of NotificationCollection
//
class NotificationBar {

    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }//end of constructor

    public void printNotifications() {
        MyIterator iterator = this.notifications.createIterator();
        System.out.println("\t\t ---Printing The Notification Bar---");
        while (iterator.hasNext()) {
            Notification notification = (Notification) iterator.next();
            System.out.println(notification.getNotification());
        }
    }//end of method printNotifications


}//end of class NotificationBar

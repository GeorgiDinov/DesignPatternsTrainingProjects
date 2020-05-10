package com.georgidinov.iterator.notifications;

class NotificationIterator implements MyIterator {

    private final Notification[] notificationList;
    //maintains the current position over the array
    int position;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
        this.position = 0;
    }//end of constructor

    @Override
    public boolean hasNext() {
        return this.position < this.notificationList.length &&
                this.notificationList[position] != null;
    }//end of method hasNext

    @Override
    public Object next() {
        //return next element int the array and increment the position
        return this.notificationList[position++];
    }//end of method next

}//end of class NotificationIterator

package com.georgidinov.observer.pollvariation;

class NewsSubscriber implements MyObserver {

    private MySubject subject;
    private String content;

    public NewsSubscriber() {
        this.subject = null;
        this.content = null;
    }//end of constructor

    @Override
    public void update() {
        String news = this.subject.getUpdate(this);
        if (this.content == null) {
            this.content = news;
        } else if (!this.content.equals(news)) {
            this.content = news;
        }
        System.out.println(this.getClass().getSimpleName() +
                " received update: " + this.content);
    }//end of method update

    @Override
    public void setSubject(MySubject subject) {
        if (this.isLegit(subject)) {
            this.subject = subject;
            System.out.println(this.getClass().getSimpleName() +
                    " Successfully Subscribed To " +
                    subject.getClass().getSimpleName());
        } else {
            System.out.println("Failure To Subscribe!");
        }
    }

    private boolean isLegit(MySubject subject) {
        return subject != null;
    }//end of method isLegit

}//end of class NewsSubscriber

package com.georgidinov.observer.pushvariation;

class BlogObserver implements MyObserver {

    //Each Observer has to have same type of member variables like the Subject
    //the one's that is interested in,
    //in other words the State that this Observer subscribed for
    //Then you can do whatever is convenient with this state, or whatever is necessary
    String content;

    public BlogObserver() {
        this.content = null;
    }//end of constructor

    @Override
    public void update(String content) {
        this.setContent(content);
        this.displayContent();
    }//end of method update

    private void displayContent() {
        System.out.println(this.getClass().getSimpleName() +
                "        has received new content: " + this.content);
    }//end of method displayContent

    private void setContent(String content) {
        this.content = content;
    }//end of method setContent

}//end of class BlogObserver

package com.georgidinov.observer.pushvariation;

class AnotherBlogObserver implements MyObserver {

    private String content;
    private String[] contentWords;

    public AnotherBlogObserver() {
        this.content = null;
    }//end of constructor

    @Override
    public void update(String content) {
        this.setContent(content);
        this.display();
    }//end of method display

    private void display() {
        System.out.println(this.getClass().getSimpleName() +
                " has received new content: " + this.content);
        System.out.print(this.getClass().getSimpleName() +
                " remove punctuation and separates words in brackets: ");
        for (String contentWord : this.contentWords) {
            System.out.print("[" + contentWord + "]");
        }
        System.out.println();
    }//end of method display

    private void setContent(String content) {
        this.content = content;
        this.contentWords = content.replaceAll("\\p{Punct}", "").split(" ");
    }//end of method setContent

}//end of class AnotherBlogObserver

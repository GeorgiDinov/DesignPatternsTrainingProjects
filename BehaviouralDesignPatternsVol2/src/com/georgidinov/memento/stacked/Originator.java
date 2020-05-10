package com.georgidinov.memento.stacked;

class Originator {

    private String fileName;
    private StringBuilder content;

    public Originator(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }//end of constructor

    public void writeContent(String text) {
        this.content.append(text);
    }//end of method writeContent

    @Override
    public String toString() {
        return this.content.toString();
    }//end of method toString

    public Object save() {
        return new Memento(this.fileName, this.content);
    }//end of method save

    public void restore(Object object) {
        Memento memento = (Memento) object;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }//end of method restore

    private class Memento {

        private final String fileName;
        private final StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }//end of constructor

    }//end of inner class Memento

}//end of class Originator

package com.georgidinov.memento.single;

class SingleMementoOriginator {
    private String fileName;
    private StringBuilder content;

    public SingleMementoOriginator(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }//end of constructor

    @Override
    public String toString() {
        return this.content.toString();
    }//end of method toString

    public void writeContent(String text) {
        this.content.append(text);
    }//end of method writeContent

    public Object save() {
        return new Memento(this.fileName, this.content);
    }//end of method save;

    public void restore(Object object) {
        Memento memento = (Memento) object;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

    private class Memento {

        String fileName;
        StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            //preventing shallow copy
            //such that the memento and the originator won't refer to the same object
            this.content = new StringBuilder(content);
        }//end of constructor

    }//end of class Memento

}//end of class SingleMementoOriginator

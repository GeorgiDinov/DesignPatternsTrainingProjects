package com.georgidinov.proxy.imageloading;


interface ImageInterface {
    void display();
}//end of interface ImageInterface

class RealImage implements ImageInterface {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        this.loadFileName(this.fileName);
    }//end of constructor

    private void loadFileName(String fileName) {
        System.out.println("Loading " + fileName);
    }//end of method loadFileName

    @Override
    public void display() {
        System.out.println("Displaying " + this.fileName);
    }//end of method display

}//end of class RealImage

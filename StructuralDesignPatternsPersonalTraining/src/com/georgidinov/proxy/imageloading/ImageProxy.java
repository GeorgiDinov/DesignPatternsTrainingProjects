package com.georgidinov.proxy.imageloading;

class ImageProxy implements ImageInterface {
    private ImageInterface image;
    private final String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }//end of constructor

    @Override
    public void display() {
        if (this.image == null) {
            this.image = new RealImage(this.fileName);
        }
        this.image.display();
    }//end of method display

}//end of class ImageProxy

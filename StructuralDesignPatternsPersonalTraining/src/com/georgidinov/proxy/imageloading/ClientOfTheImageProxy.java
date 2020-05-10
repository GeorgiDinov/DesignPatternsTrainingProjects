package com.georgidinov.proxy.imageloading;

class ClientOfTheImageProxy {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Proxy Design Pattern Image Example>>>\n");

        ImageInterface proxy = new ImageProxy("image.jpg");
        System.out.println("First time proxy.display() called " +
                "image is being loaded and then displayed: ");
        proxy.display();
        System.out.println();
        System.out.println("Second time proxy.display() called " +
                "image is already loaded(cashed) and it's displayed:");
        proxy.display();

    }//end of main method

}//end of class ClientOfTheImageProxy

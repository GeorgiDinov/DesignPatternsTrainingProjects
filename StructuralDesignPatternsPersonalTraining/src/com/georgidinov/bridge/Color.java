package com.georgidinov.bridge;

//Implementor
interface Color {
    void fillWithColor(int borderSize);
}//end of interface Color

class RedColor implements Color {

    @Override
    public void fillWithColor(int borderSize) {
        System.out.println("painted in RED color with " + borderSize + " inches border.");
    }//end of method fillWithColor

}//end of class RedColor

class GreenColor implements Color {

    @Override
    public void fillWithColor(int borderSize) {
        System.out.println("painted in GREEN color with " + borderSize + " inches border.");
    }//end of method fillWithColor

}//end of class GreenColor
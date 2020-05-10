package com.georgidinov.templatemethod;

class BrickHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("This House Has Brick Walls");
    }

    @Override
    protected void buildTheRoof() {
        System.out.println("This House Will Have Roof Made Of Tails");
    }

    @Override
    protected void color() {
        System.out.println("This House Will Remain In It's Original Brick Outlook.");
    }

    //color method wont be displayed
    @Override
    protected boolean bePaintedHook() {
        return false;
    }

    //hook method, was empty in the abstract class
    @Override
    protected void buildPool() {
        System.out.println("This House Has A Pool In The Back Yard");
    }

}//end of class BrickHouse

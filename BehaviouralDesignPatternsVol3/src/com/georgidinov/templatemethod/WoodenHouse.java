package com.georgidinov.templatemethod;

class WoodenHouse extends HouseTemplate {


    @Override
    protected void buildWalls() {
        System.out.println("Walls Are Made Of Wood");
    }


    @Override
    protected void buildTheRoof() {
        System.out.println("The Roof Is Made Of Special Stone Plates");
    }

    @Override
    protected void color() {
        System.out.println("This Wooden House Is Painted In Brown");
    }

    //color method will be displayed
    @Override
    protected boolean bePaintedHook() {
        return true;
    }

}//end of class WoodenHouse

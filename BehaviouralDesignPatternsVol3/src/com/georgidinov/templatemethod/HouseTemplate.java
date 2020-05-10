package com.georgidinov.templatemethod;

abstract class HouseTemplate {

    //the template method
    public final void buildHouse() {
        this.buildFoundations();
        this.buildPillars();
        this.buildWalls();
        this.buildTheRoof();
        if (this.bePaintedHook()) {
            this.color();
        } else {
            System.out.println("This House Is Not Painted");
        }
        this.buildPool();
    }//end of template method buildHouse


    //default method
    private void buildFoundations() {
        System.out.println("Building concrete and steel foundations.");
    }//end of method buildFoundations

    //default method
    private void buildPillars() {
        System.out.println("Building The Pillars");
    }//end of method buildPillars


    //HOOK method
    protected boolean bePaintedHook() {
        return true;
    }//end of HOOK method bePainted

    //another HOOK method this time empty
    protected void buildPool() {
    }


    //abstract methods
    protected abstract void buildWalls();

    protected abstract void buildTheRoof();

    protected abstract void color();


}//end of abstract class HouseTemplate

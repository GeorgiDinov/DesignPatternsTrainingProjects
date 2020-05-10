package com.georgidinov.facade;

interface Menu {
    void showMenu();
}//end of interface Menu

class VegetarianMenu implements Menu {

    VegetarianMenu() {
        System.out.println("\tNew Vegetarian Menu Is Created!");
    }//end of constructor

    @Override
    public void showMenu() {
        System.out.println("\tShowing \'The Vegetarian Menu\'!");
    }//end of method showMenu

}//end of class VegetarianMenu

class NonVegetarianMenu implements Menu {

    NonVegetarianMenu() {
        System.out.println("\tNew NonVegetarian Menu Is Created!");
    }//end of constructor

    @Override
    public void showMenu() {
        System.out.println("\tShowing \'The NonVegetarian Menu\'!");
    }//end of method showMenu

}//end of class NonVegetarianMenu

class BothVegetarianAndNonVegetarianMenu implements Menu {

    BothVegetarianAndNonVegetarianMenu() {
        System.out.println("\tBothVegetarianAndNonVegetarianMenu Menu Is Created!");
    }//end of constructor

    @Override
    public void showMenu() {
        System.out.println("\tShowing \'BothVegetarianAndNonVegetarianMenu Menu\'!");
    }//end of method showMenu

}//end of class BothVegetarianAndNonVegetarianMenu
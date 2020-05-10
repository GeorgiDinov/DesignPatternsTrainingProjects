package com.georgidinov.facade;

class HotelKeeperFacade {

    public NonVegetarianMenu getNonVegetarianMenu() {
        NonVegetarianRestaurant nvr = new NonVegetarianRestaurant();
        return (NonVegetarianMenu) nvr.getMenu();
    }//end of method getNonVegetarianMenu

    public VegetarianMenu getVegetarianMenu() {
        VegetarianRestaurant vr = new VegetarianRestaurant();
        return (VegetarianMenu) vr.getMenu();
    }//end of method getVegetarianMenu

    public BothVegetarianAndNonVegetarianMenu getBothVegetarianAndNonVegetarianMenu() {
        BothVegetarianAndNonVegetarianRestaurant bvnr = new BothVegetarianAndNonVegetarianRestaurant();
        return (BothVegetarianAndNonVegetarianMenu) bvnr.getMenu();
    }//end of method BothVegetarianAndNonVegetarianMenu

}//end of class HotelKeeperFacade

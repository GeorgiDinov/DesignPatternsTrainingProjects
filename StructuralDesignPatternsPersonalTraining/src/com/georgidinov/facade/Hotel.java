package com.georgidinov.facade;

interface Hotel {
    Menu getMenu();
}//end of interface Hotel

class VegetarianRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new VegetarianMenu();
    }
}//end of class VegetarianRestaurant

class NonVegetarianRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new NonVegetarianMenu();
    }
}//end of class NonVegetarianRestaurant

class BothVegetarianAndNonVegetarianRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new BothVegetarianAndNonVegetarianMenu();
    }
}//end of class BothVegetarianAndNonVegetarianMenu
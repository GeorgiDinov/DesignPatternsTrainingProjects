package com.georgidinov.facade;

//
//Facade design pattern when we want to make the client interact with
//complex system or subsystems easy by providing common interface for
//all interfaces of the subsystem
//make composition with all the interfaces or concrete classes
//that are part of the subsystem
//expose simplified implementation by showing a couple of methods to the client
//those methods probably will contain lots of member variables with their method calls
//The idea is to simplify complex operation by simplifying the call to it
//E.g. let say we want to drill a hall into the wall with the use of a drill
//  1.We need to prepare the drill... let say methods like pullOutOfTheBox, chooseDrillBit,
//plugCordIntoPlug, presStartButton etc.
//  2.We need to mark the wall lets say with pencil... methods like draw
//  3.We need something to clean the dust like sweeper or vacuum cleaner
//Those are other objects with more method calls
//Here the facade comes into play by simplifying all those objects and method calls into
//composition in another class(The Facade) with one or two methods
//with the example above our facade will have one method
//drillHole() and all the method calls and other objects will be in it.
//we may abstract it even further if we need to by declaring the facade to be abstract class
//By that we can provide different ways(in the concrete implementations - the subclasses)
//to interact with the subsystem
//
class FacadeClient {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Facade Design Pattern>>>\n");

        System.out.println("Menus created: ");
        HotelKeeperFacade facade = new HotelKeeperFacade();
        VegetarianMenu vm = facade.getVegetarianMenu();
        NonVegetarianMenu nVm = facade.getNonVegetarianMenu();
        BothVegetarianAndNonVegetarianMenu bVnVm = facade.getBothVegetarianAndNonVegetarianMenu();

        System.out.println("\nMenus as follows: ");
        vm.showMenu();
        nVm.showMenu();
        bVnVm.showMenu();

    }//end of main method

}//end of class FacadeClient

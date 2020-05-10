package com.georgidinov.flyweight;

import java.util.Random;

//
//Flyweight design pattern when memory is an issue
//Helps with the use of already created objects by reassigning them with new
//"extrinsic" properties from the client that wants to use them
//all of the objects have the same "intrinsic" state(internal state, also something like basic state)
//there is factory method involved which controls creation and distribution of the objects
//the factory class contains all created objects cashed(in our case in a HashMap)
//if the client wants already created object the factory checks the cash and returns it
//in not it creates that object and store it in it's cash(the HashMap)
//then the client adds all the extrinsic state he needs(some kind of setters)
//If the client needs the same object type but with different outer state the call to the
//factory method will pull out that object from the cash and the new state will be added
//
class FlyweightClient {   //Counter Strike game simulation

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "\n\t\t\t<<<Flyweight Design Pattern>>>\n");
        PlayerFactory factory = new PlayerFactory();
        Player player;

        for (int i = 0; i < 10; i++) {
            player = factory.getPlayer(randomPlayer());
            player.assignWeapon(randomWeapon());
            player.mission();
        }//end of for loop

        int numberOfObjectsCreated = factory.getNumberOfPlayersCreated();
        System.out.println(ANSI_RED + "\nTotal number of Players Created = " + numberOfObjectsCreated);
    }//end of main method

    private static String randomPlayer() {
        Random random = new Random();
        int number = random.nextInt(20);
        if (number % 2 == 0) {
            return "Terrorist";
        } else {
            return "CounterTerrorist";
        }
    }//end of method randomPlayer

    private static String randomWeapon() {
        Random random = new Random();
        String[] weapons = {
                "AK-47",
                "M-16",
                "Desert Eagle",
                "Gut Knife",
                "M-4",
                "AR-15",
                "AK-74",
                "Glock-17",
                "TT",
                "RPG",
                "MP-5"
        };
        return weapons[random.nextInt(weapons.length)];
    }//end of method randomWeapon

}//end of class FlyweightClient

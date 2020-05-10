package com.georgidinov.flyweight;

import java.util.HashMap;
import java.util.Map;

class PlayerFactory {

    private static final String ANSI_RED = "\u001B[31m";
    private final Map<String, Player> players = new HashMap<>();

    public int getNumberOfPlayersCreated() {
        return this.players.size();
    }//end of method getNumberOfPlayersCreated

    public Player getPlayer(String playerType) {
        Player player = null;
        if (this.players.containsKey(playerType)) {
            player = this.players.get(playerType);
        } else {
            switch (playerType) {
                case "Terrorist":
                    System.out.println(ANSI_RED + "\tTerrorist created");
                    player = new Terrorist();
                    this.players.put("Terrorist", player);
                    break;
                case "CounterTerrorist":
                    System.out.println(ANSI_RED + "\tCounterTerrorist created");
                    player = new CounterTerrorist();
                    this.players.put("CounterTerrorist", player);
                    break;
                default:
                    System.out.println("Player Factory can produce " +
                            "Terrorists or CounterTerrorists only");
            }//end of switch

        }//end of else clause

        return player;

    }//end of method getPlayer

}//end of class PlayerFactory

package com.georgidinov.adapter;

//Basic mechanism for the composition variation of the Adapter Pattern
//First we keep the principle "Program to an interface"
//We want to make one interface compatible with another interface
//In our case interface MediaPlayer and interface AdvancedMediaPlayer
//So called "target interface" is the one we want to adapt
//We create new class which implements the target interface
//in our case AdvancedMediaPlayerAdapter implements interface MediaPlayer
//In this class we need a member variable from the "adapted to" type
//in our case from AdvancedMediaPlayer(programing to an interface, each type that implements
//the interface is a potential type we can convert/adapt to)
//We pass(inject) an object via the constructor and initialize our member variable
//then we override methods from the target interface and use our member variable methods
//to convert the behavior to the "adapt to" interface
class AdvancedMediaPlayerAdapter implements MediaPlayer {

    private final AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }//end of constructor

    @Override
    public void play(String audioType, String fileName) {
        this.advancedMediaPlayer.loadFileName(fileName);
        this.advancedMediaPlayer.listen();
    }//end of method play

}//end of class AdvancedMediaPlayerAdapter

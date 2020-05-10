package com.georgidinov.adapter;

class AdapterClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Adapter Design Pattern>>>\n");

        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3 file", "MySong.mp3");

        MediaPlayer vlcPlayerAdapter = new AdvancedMediaPlayerAdapter(new VlcPlayer());
        vlcPlayerAdapter.play("vlc file", "MySong.vlc");

        MediaPlayer mp4AudioAdapter = new AdvancedMediaPlayerAdapter(new Mp4Player());
        mp4AudioAdapter.play("mp4 file", "MySong.mp4");

        System.out.println("\n\t\t\t***Testing players for .avi format***");
        audioPlayer.play("avi file", "MyMovie.avi");
        vlcPlayerAdapter.play("avi file", "MyMovie.avi");
        mp4AudioAdapter.play("avi file", "MyMovie.avi");
    }//end of main method
}//end of class AdapterClient

package com.georgidinov.adapter;

interface MediaPlayer {
    void play(String audioType, String fileName);
}//end of interface MediaPlayer


class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.contains("mp3") && fileName.endsWith(".mp3")) {
            System.out.println("\t<" + this.getClass().getSimpleName() + "> Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("\t<" + this.getClass().getSimpleName() + "> Media type " + audioType + " format not supported!");
        }
    }//end fo method play

}//end of class AudioPlayer
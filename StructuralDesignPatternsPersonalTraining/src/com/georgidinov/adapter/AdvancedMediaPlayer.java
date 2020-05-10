package com.georgidinov.adapter;

interface AdvancedMediaPlayer {
    void loadFileName(String fileName);

    void listen();
}//end of interface AdvancedMediaPlayer

class VlcPlayer implements AdvancedMediaPlayer {
    private String fileName;

    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        if (this.fileName.endsWith(".vlc")) {
            System.out.println("\t<" + this.getClass().getSimpleName() + ">\t  Playing vlc file. Name: " + this.fileName);
        } else {
            System.out.println("\t<" + this.getClass().getSimpleName() + ">\t  Media type " +
                    this.fileName.substring(this.fileName.length() - 3) +
                    " file format not supported!");
        }
    }

}//end of class VlcPlayer

class Mp4Player implements AdvancedMediaPlayer {
    private String fileName;

    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        if (this.fileName.endsWith(".mp4")) {
            System.out.println("\t<" + this.getClass().getSimpleName() + ">\t  Playing mp4 file. Name: " + this.fileName);
        } else {
            System.out.println("\t<" + this.getClass().getSimpleName() + ">\t  Media type " +
                    this.fileName.substring(this.fileName.length() - 3) +
                    " file format not supported!");
        }
    }

}//end of class Mp4Player

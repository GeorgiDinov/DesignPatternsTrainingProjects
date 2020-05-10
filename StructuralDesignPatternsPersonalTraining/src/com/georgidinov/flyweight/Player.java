package com.georgidinov.flyweight;

interface Player {
    //intrinsic state
    void mission();

    //extrinsic state
    void assignWeapon(String weapon);

}//end of interface Player

class Terrorist implements Player {
    private static final String ANSI_GREEN = "\u001B[32m";
    private final String task;
    //extrinsic state, usually extrinsic data is not int the object,
    //but for learning purposes we will print it
    //and assign it through the extrinsic method
    private String terroristWeapon;

    public Terrorist() {
        this.task = "PLANT A BOMB";
    }//end of constructor

    @Override
    public void mission() {
        System.out.println(ANSI_GREEN + this.getClass().getSimpleName() +
                " assigned with weapon " + this.terroristWeapon +
                "| Task is " + this.task);
    }//end of method mission

    @Override
    public void assignWeapon(String weapon) {
        this.terroristWeapon = weapon;
    }//end of method assignWeapon

}//end of class Terrorist

class CounterTerrorist implements Player {
    private static final String ANSI_CYAN = "\u001B[36m";
    private final String task;
    //extrinsic state, usually extrinsic data is not int the object,
    //but for learning purposes we will print it
    //and assign it through the extrinsic method
    private String counterTerroristWeapon;

    public CounterTerrorist() {
        this.task = "DIFFUSE BOMB";
    }//end of constructor

    @Override
    public void mission() {
        System.out.println(ANSI_CYAN + this.getClass().getSimpleName() +
                " assigned with weapon " + this.counterTerroristWeapon +
                "| Task is " + this.task);
    }//end of method mission

    @Override
    public void assignWeapon(String weapon) {
        this.counterTerroristWeapon = weapon;
    }//end of method assignWeapon

}//end of class CounterTerrorist

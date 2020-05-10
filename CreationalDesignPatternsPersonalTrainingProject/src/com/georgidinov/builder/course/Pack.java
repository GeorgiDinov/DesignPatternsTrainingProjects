package com.georgidinov.builder.course;

interface Pack {
    String getPack();
}//end of interface Pack

class Wrapper implements Pack {
    @Override
    public String getPack() {
        return "Wrapper";
    }
}//end of class Wrapper

class Bottle implements Pack {
    @Override
    public String getPack() {
        return "Bottle";
    }
}//end of class Bottle

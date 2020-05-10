package com.georgidinov.state;

interface MobilePhoneAlarmState {
    void alert();
}//end of interface MobilePhoneAlarmState


class Vibration implements MobilePhoneAlarmState {

    @Override
    public void alert() {
        System.out.println("Vibration...");
    }//end of method alert

}//end of class Vibration

class Silent implements MobilePhoneAlarmState {

    @Override
    public void alert() {
        System.out.println("Silent...");
    }//end of method alert

}//end of class Silent
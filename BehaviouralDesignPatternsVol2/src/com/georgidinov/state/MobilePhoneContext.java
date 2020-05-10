package com.georgidinov.state;

class MobilePhoneContext {

    private MobilePhoneAlarmState state;

    public MobilePhoneContext(MobilePhoneAlarmState state) {
        this.state = state;
    }//end of constructor

    public MobilePhoneAlarmState getState() {
        return state;
    }//end of method getState

    public void setState(MobilePhoneAlarmState state) {
        this.state = state;
    }//end of method setState

    public void ring() {
        System.out.print("Mobile Phone Ringtone Is On ");
        this.state.alert();
    }//end of method ring

}//end of class MobilePhoneContext

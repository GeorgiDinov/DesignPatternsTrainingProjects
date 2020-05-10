package com.georgidinov.proxy.internetaccess;

interface InternetConnection {
    void connect(String url) throws Exception;
}//end of interface InternetConnection


class RealConnection implements InternetConnection {

    @Override
    public void connect(String url) {
        System.out.println("Connecting to " + url);
    }//end of method connection

}//end of class RealConnection
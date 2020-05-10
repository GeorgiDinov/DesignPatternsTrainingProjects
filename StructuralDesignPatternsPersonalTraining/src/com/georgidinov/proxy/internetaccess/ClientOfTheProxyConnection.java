package com.georgidinov.proxy.internetaccess;

class ClientOfTheProxyConnection {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Proxy Design Pattern Connection Control Example>>>\n");

        InternetConnection proxy = new ProxyConnection();

        try {
            System.out.println("Connecting to NOT restricted url's...");
            proxy.connect("email@com");
            proxy.connect("abv.bg");
            proxy.connect("gmail.com");
            System.out.println();
            System.out.println("Attempting to connect to restricted url...");
            proxy.connect("sorry.net");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }//end of try catch block

    }//end of main method

}//end of class ClientOfTheProxyConnection

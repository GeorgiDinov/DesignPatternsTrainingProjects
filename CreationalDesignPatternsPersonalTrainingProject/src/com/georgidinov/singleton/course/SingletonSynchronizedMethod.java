package com.georgidinov.singleton.course;

//Thread safe approach but may cause performance hit(slower)
class SingletonSynchronizedMethod {

    private static SingletonSynchronizedMethod instance = null;
    private int someData = 0;

    private SingletonSynchronizedMethod() {
    }//end of constructor

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }//end of method getInstance

    public int getSomeData() {
        return someData;
    }

    public void setSomeData(int someData) {
        this.someData = someData;
    }
}//end of class SingletonSynchronizedMethod

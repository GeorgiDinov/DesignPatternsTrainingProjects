package com.georgidinov.singleton.course;


class SingletonDoubleCheckedLocking {

    //using the "volatile" keyword we ensure consistency in multithreading environment
    private static volatile SingletonDoubleCheckedLocking instance = null;
    private int someData = 0;

    private SingletonDoubleCheckedLocking() {
    }//end of constructor

    //double check performed in the cetInstance method
    //Synchronizing on the class itself
    public static SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonSynchronizedMethod.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }//end of inner if
            }//end of synchronized block
        }//end of outer i
        return instance;
    }//end of method getInstance

    public int getSomeData() {
        return someData;
    }

    public void setSomeData(int someData) {
        this.someData = someData;
    }
}//end of class SingletonDoubleCheckedLocking

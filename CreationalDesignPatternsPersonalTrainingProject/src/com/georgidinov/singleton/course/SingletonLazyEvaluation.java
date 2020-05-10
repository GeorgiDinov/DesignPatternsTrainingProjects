package com.georgidinov.singleton.course;

//Not a thread safe approach
class SingletonLazyEvaluation {

    private static SingletonLazyEvaluation instance = null;
    private int someData = 0;

    private SingletonLazyEvaluation() {
    }//end of constructor

    public static SingletonLazyEvaluation getInstance() {
        if (instance == null) {
            instance = new SingletonLazyEvaluation();
        }
        return instance;
    }

    public int getSomeData() {
        return someData;
    }

    public void setSomeData(int someData) {
        this.someData = someData;
    }
}//end of class SingletonLazyEvaluation

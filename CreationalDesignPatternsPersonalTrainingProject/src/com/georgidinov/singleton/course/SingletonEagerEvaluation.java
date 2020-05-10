package com.georgidinov.singleton.course;

//Thread safe, but is loaded even of not called(at class loading time)
//depends how many resources consumes, if there are not much of an impact
//no problem
class SingletonEagerEvaluation {

    private static final SingletonEagerEvaluation instance = new SingletonEagerEvaluation();
    private int someData = 0;

    private SingletonEagerEvaluation() {
    }//end of constructor

    public static SingletonEagerEvaluation getInstance() {
        return instance;
    }//end of method getInstance

    public int getSomeData() {
        return someData;
    }

    public void setSomeData(int someData) {
        this.someData = someData;
    }
}//end of class SingletonEagerEvaluation

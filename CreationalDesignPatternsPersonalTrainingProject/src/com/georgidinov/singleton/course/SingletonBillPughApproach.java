package com.georgidinov.singleton.course;

//Improvement over the "Eager Evaluation" approach
//The key thing here is even though the inner class is static
//IT WON'T BE LOADED IN MEMORY BY THE "JVM"
//UNTIL THAT INSTANCE IS NEEDED VIA THE getInstance() method
//WHEN getInstance() is CALLED THE "JVM" WILL  LOAD THE INNER CLASS in memory
//AND THE INSTANCE WILL BE CRATED
//It is thread safe, because there is only one instance
//and saves resources because it is loaded in
//memory when the client need it(call it)
//
//***According to the instructor in the
//***design pattern course
//***this is the preferred approach from all java developers
//
class SingletonBillPughApproach {

    private int someData;

    private SingletonBillPughApproach() {
    }//end of constructor

    public static SingletonBillPughApproach getInstance() {
        return SingletonClassHelper.instance;
    }//end of method getInstance

    private static class SingletonClassHelper {
        private static final SingletonBillPughApproach instance = new SingletonBillPughApproach();
    }//end of helper inner class SingletonClassHelper

    public int getSomeData() {
        return someData;
    }

    public void setSomeData(int someData) {
        this.someData = someData;
    }

}//end of class SingletonBillPughApproach

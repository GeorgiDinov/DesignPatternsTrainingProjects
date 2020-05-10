package com.georgidinov.singleton.course;

class SingletonClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t<<<Singleton Design Pattern>>>\n");

        SingletonLazyEvaluation lazySingleton = SingletonLazyEvaluation.getInstance();
        lazySingleton.setSomeData(1);
        System.out.println("\tSingleton <Lazy Evaluation> \t\tgetSomeData() called: " +
                lazySingleton.getSomeData());

        SingletonSynchronizedMethod synchronizedSingleton = SingletonSynchronizedMethod.getInstance();
        synchronizedSingleton.setSomeData(2);
        System.out.println("\tSingleton <Synchronized Method> \tgetSomeData() called: " +
                synchronizedSingleton.getSomeData());

        SingletonDoubleCheckedLocking doubleCheckedSingleton = SingletonDoubleCheckedLocking.getInstance();
        doubleCheckedSingleton.setSomeData(3);
        System.out.println("\tSingleton <Double Checked Locking>  getSomeData() called: " +
                doubleCheckedSingleton.getSomeData());

        SingletonEagerEvaluation eagerSingleton = SingletonEagerEvaluation.getInstance();
        eagerSingleton.setSomeData(4);
        System.out.println("\tSingleton <Eager Evaluation> \t\tgetSomeData() called: " +
                eagerSingleton.getSomeData());

        SingletonBillPughApproach singleton = SingletonBillPughApproach.getInstance();
        singleton.setSomeData(5);
        System.out.println("\tSingleton <Bill Pugh Approach> \t\tgetSomeData() called: " +
                singleton.getSomeData());

    }//end of main method

}//end of class SingletonClient

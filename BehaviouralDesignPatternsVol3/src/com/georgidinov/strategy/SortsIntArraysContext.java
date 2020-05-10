package com.georgidinov.strategy;

//without reference of the Strategy object
class SortsIntArraysContext {

    public void sortArray(int[] array, SortStrategy strategy) {
        strategy.sort(array);
    }//end of method sortArray

}//end of class SortsIntArraysContext

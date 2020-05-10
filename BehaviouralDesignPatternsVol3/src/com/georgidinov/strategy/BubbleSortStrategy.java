package com.georgidinov.strategy;

class BubbleSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] array) {
        for (int last = array.length - 1; last > 0; last--) {
            for (int i = 0; i < last; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }//end of method sort

}//end of class BubbleSort
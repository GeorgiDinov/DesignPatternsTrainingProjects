package com.georgidinov.strategy;

class ShellSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] array) {
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int right = step; right < array.length; right++) {
                int candidate = array[right];
                int left;
                for (left = right; left >= step && array[left - step] > candidate; left -= step) {
                    array[left] = array[left - step];
                }
                array[left] = candidate;
            }
        }
    }//end of method sort

}//end of class ShellSort

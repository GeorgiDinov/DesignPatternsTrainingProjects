package com.georgidinov.strategy;

import java.util.function.Consumer;

class ConsumerStrategyContext {

    public void sort(int[] array, Consumer<int[]> consumer) {
        consumer.accept(array);
    }//end of method sort

}//end of method ConsumerStrategyContext

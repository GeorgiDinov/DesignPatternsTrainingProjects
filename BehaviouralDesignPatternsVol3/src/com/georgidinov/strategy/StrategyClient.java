package com.georgidinov.strategy;

import java.util.function.Consumer;

//
//--------------------------------------Strategy Design Pattern
//Very similar to the State Design Pattern, but here the Context class does not hold a reference to
//the Strategy object,
//as in the State pattern the Context HOLD a reference to the State object
//Mainly the Strategy is passed to the Context from the Client to a specific method
//
//Very straight forward pattern in the sortArray() method(defined in the context class)
//you pass the array and the desired strategy(algorithm) for sorting
//
//>>>>I suppose you could hold a reference if you want to change strategies based of conditions
//-----------------------------------------
//lets say the array's length is less than 20 items you can use slower sorting algorithm
//or if memory is not an issue you can use not in place  algorithms(that use additional memory, for variables
//copies etc. which number arises with the number of elements, if number of additional variables does not
// changes with the increasing number of elements it's still in place algorithm)
//-----------------------------------------
//  Most of the time the Client that uses the Context
//will pass him the desired Strategy to perform the operation
//in our case the Client calls the Context class method
// by passing the array and the strategy for sorting
//
//Collections sort method uses Strategy you passed the strategy for sorting with a comparator
//different comparator(strategies) will result in different sorted outputs
//You can also use the function package by passing some functional interface
//to the method of the Context
//
class StrategyClient {

    public static void main(String[] args) {

        SortsIntArraysContext sortMaster = new SortsIntArraysContext();
        System.out.println("\n\t\t\t<<<Strategy Design Pattern>>>\n");
        int[] arrayToSort = {7, 1, -22, 35, 55, 1, -6};
        System.out.print("Array before sort : ");
        printArray(arrayToSort);


        System.out.print("Array after sort performed by BubbleSortStrategy:  ");
        sortMaster.sortArray(arrayToSort, new BubbleSortStrategy());
        printArray(arrayToSort);

        System.out.println();

        int[] anotherArrayToSort = {-3, 8, -75, 1, 14, 5, 0};
        System.out.print("Another array before sort: ");
        printArray(anotherArrayToSort);

        System.out.print("Another array after sort performed by ShellSortStrategy: ");
        sortMaster.sortArray(anotherArrayToSort, new ShellSortStrategy());
        printArray(anotherArrayToSort);


        System.out.println("\n\n\t\t\tExample with the Consumer Functional Interface " +
                "And Different Context For Clarification:");

        int[] consumerArray = {57, -1, 5, 18, -43, 7, 12};
        System.out.print("Consumer array before sort: ");
        printArray(consumerArray);

        ConsumerStrategyContext consumerContext = new ConsumerStrategyContext();
        consumerContext.sort(consumerArray, consumerSortingStrategy);
        System.out.print("Consumer array after sort performed by the Consumer Interface Strategy Example: ");
        printArray(consumerArray);

    }//end of main method

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(
                    (i == 0) ? "[" + array[i] :
                            (i != array.length - 1) ?
                                    ", " + array[i] :
                                    ", " + array[i] + "]\n"
            );
        }
    }//end of method printArray


    //defined it here but you could define it right at the method signature
    //implementation of selection sort
    private static final Consumer<int[]> consumerSortingStrategy = array -> {
        for (int last = array.length - 1; last > 0; last--) {
            int indexHoldingMaxValue = last;
            for (int i = 0; i < last; i++) {
                if (array[i] > array[indexHoldingMaxValue]) {
                    indexHoldingMaxValue = i;
                }
            }
            int temp = array[indexHoldingMaxValue];
            array[indexHoldingMaxValue] = array[last];
            array[last] = temp;
        }
    };//end of consumerSortingStrategy behaviour

}//end of class StrategyClient

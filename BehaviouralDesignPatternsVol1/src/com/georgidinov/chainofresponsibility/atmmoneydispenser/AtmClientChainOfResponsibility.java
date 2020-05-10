package com.georgidinov.chainofresponsibility.atmmoneydispenser;

import java.util.InputMismatchException;
import java.util.Scanner;

class AtmClientChainOfResponsibility {

    private final DispenseChainInterface firstInChain;

    public AtmClientChainOfResponsibility() {
        this.firstInChain = new FiftyDollarBills();
        TwentyDollarBills secondInChain = new TwentyDollarBills();
        TenDollarBills thirdInChain = new TenDollarBills();
        //setting up the chain
        firstInChain.setNextInChain(secondInChain);
        secondInChain.setNextInChain(thirdInChain);
    }//end of constructor


    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Chain Of Responsibility Design Pattern>>>\n");

        AtmClientChainOfResponsibility atmDispenser = new AtmClientChainOfResponsibility();

        while (true) {
            int amount = getInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiples of 10!");
                return;
            }
            atmDispenser.firstInChain.dispense(new Currency(amount));
        }

    }//end of main method

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter amount to dispense: ");
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        }
    }//end of method getInt

}//end of class Client

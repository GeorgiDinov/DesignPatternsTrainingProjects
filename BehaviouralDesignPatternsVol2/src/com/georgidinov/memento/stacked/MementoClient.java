package com.georgidinov.memento.stacked;

class MementoClient {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Memento Design Pattern>>>\n");
        try {
            Thread.sleep(2000);
            //creating the originator
            Originator originator = new Originator("file.txt");
            System.out.println("Originator object created...new state added");
            Thread.sleep(3000);
            originator.writeContent("State # 1");
            System.out.println("\tOriginator current state is   " + originator);
            System.out.println("Sate Stored As: " + originator);
            Thread.sleep(2000);
            Caretaker caretaker = new Caretaker();
            caretaker.save(originator);

            System.out.println("\nAdding new state...");
            Thread.sleep(3000);
            originator.writeContent("->State # 2");
            System.out.println("\tOriginator current state is   " + originator);
            System.out.println("Sate Stored As: " + originator);
            caretaker.save(originator);
            Thread.sleep(2000);

            System.out.println("\nAdding new state...");
            Thread.sleep(3000);
            originator.writeContent("->State # 3");
            System.out.println("\tOriginator current state is   " + originator);
            System.out.println("Sate Stored As: " + originator);
            caretaker.save(originator);
            Thread.sleep(2000);

            System.out.println("\nAdding new state...");
            Thread.sleep(3000);
            originator.writeContent("->State # 4");
            System.out.println("\tOriginator current state is   " + originator);
            Thread.sleep(3000);

            System.out.println("\nRestoring LAST state...");
            Thread.sleep(3000);
            caretaker.restore(originator);
            System.out.println("\tOriginator current state is   " + originator);
            Thread.sleep(2000);

            System.out.println("\nRestoring to FIRST stored state...");
            Thread.sleep(3000);
            caretaker.restoreSpecificState(originator, 0);
            System.out.println("\tOriginator current state is   " + originator);

            System.out.println("\nRestoring to SECOND stored state...");
            Thread.sleep(3000);
            caretaker.restoreSpecificState(originator, 1);
            System.out.println("\tOriginator current state is   " + originator);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }//end of main method

}//end of class MementoClient

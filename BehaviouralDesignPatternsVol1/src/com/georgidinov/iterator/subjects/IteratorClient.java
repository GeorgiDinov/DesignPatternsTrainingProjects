package com.georgidinov.iterator.subjects;

class IteratorClient {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Iterator Design Pattern>>>");

        ScienceDepartment scienceDepartment = new ScienceDepartment();
        scienceDepartment.loadSubjects();
        printTheCollection(scienceDepartment);

        ArtsDepartment artsDepartment = new ArtsDepartment();
        artsDepartment.loadSubjects();
        printTheCollection(artsDepartment);

    }//end of main method

    private static void printTheCollection(TheCollection collection) {
        String collectionName = collection.getClass().getSimpleName();
        TheIterator iterator = collection.getIterator();
        int i = 1;
        System.out.println("\n\t\t" + collectionName + " Subjects: ");
        while (iterator.isDone()) {
            Subject subject = iterator.next();
            System.out.println((i++) + ". " + subject.getName());
        }//end of while loop

        System.out.println("\n\t\tTesting currentItem() and first() methods: ");

        System.out.println(collectionName + "::currentItem() = " +
                iterator.currentItem().getName());

        System.out.println(collectionName + "::first()");
        iterator.first();

        System.out.println(collectionName + "::currentItem() = " +
                iterator.currentItem().getName());

    }//end of method printTheCollection

}//end of class Client

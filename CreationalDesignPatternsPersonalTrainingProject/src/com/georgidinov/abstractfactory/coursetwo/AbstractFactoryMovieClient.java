package com.georgidinov.abstractfactory.coursetwo;

class AbstractFactoryMovieClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t<<<Abstract Factory Design Pattern>>>");

        AbstractMovieFactory movieFactory = AbstractMovieFactoryProducer.getFactory("Action");
        HollyWoodMovies hollyWoodAction = movieFactory.getHollyWoodMovie();
        BullyWoodMovies bullyWoodAction = movieFactory.getBullyWoodMovie();

        //dereference
        movieFactory = AbstractMovieFactoryProducer.getFactory("Comedy");
        HollyWoodMovies hollyWoodComedy = movieFactory.getHollyWoodMovie();
        BullyWoodMovies bullyWoodComedy = movieFactory.getBullyWoodMovie();

        System.out.println("\nAction Movie Factory Called: ");
        System.out.println(hollyWoodAction.getMovieName());
        System.out.println(bullyWoodAction.getMovieName());

        System.out.println("\nComedy Movie Factory Called:");
        System.out.println(hollyWoodComedy.getMovieName());
        System.out.println(bullyWoodComedy.getMovieName());


    }//end of main method

}//end of class AbstractFactoryMovieClient

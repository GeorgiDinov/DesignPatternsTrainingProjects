package com.georgidinov.abstractfactory.coursetwo;

class AbstractMovieFactoryProducer {

    public static AbstractMovieFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        } else if (factoryType.equalsIgnoreCase("Comedy")) {
            return new ComedyMovieFactory();
        } else if (factoryType.equalsIgnoreCase("Action")) {
            return new ActionMovieFactory();
        }
        return null;
    }//end of method getFactory

}//end of class AbstractMovieFactoryProducer

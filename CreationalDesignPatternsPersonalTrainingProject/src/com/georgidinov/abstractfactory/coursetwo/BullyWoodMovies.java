package com.georgidinov.abstractfactory.coursetwo;

interface BullyWoodMovies {
    String getMovieName();
}//end of interface BullyWoodMovies

class BullyWoodAction implements BullyWoodMovies {
    @Override
    public String getMovieName() {
        return "\tInside BullyWoodAction::getMovieName() method.";
    }
}//end of class BullyWoodAction

class BullyWoodComedy implements BullyWoodMovies {
    @Override
    public String getMovieName() {
        return "\tInside BullyWoodComedy::getMovieName() method.";
    }
}//end of class BullyWoodComedy
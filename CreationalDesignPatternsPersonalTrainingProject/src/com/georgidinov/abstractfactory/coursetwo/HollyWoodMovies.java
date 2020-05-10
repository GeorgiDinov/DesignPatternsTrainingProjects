package com.georgidinov.abstractfactory.coursetwo;

interface HollyWoodMovies {
    String getMovieName();
}//end of interface HollyWoodMovies

class HollyWoodAction implements HollyWoodMovies {
    @Override
    public String getMovieName() {
        return "\tInside HollyWoodAction::getMovieMethod().";
    }
}//end of class HollyWoodAction

class HollyWoodComedy implements HollyWoodMovies {
    @Override
    public String getMovieName() {
        return "\tInside HollyWoodComedy::getMovieMethod().";
    }
}//end of class HollyWoodComedy

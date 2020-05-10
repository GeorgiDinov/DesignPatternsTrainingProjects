package com.georgidinov.abstractfactory.coursetwo;

abstract class AbstractMovieFactory {
    protected abstract HollyWoodMovies getHollyWoodMovie();

    protected abstract BullyWoodMovies getBullyWoodMovie();
}//end of abstract class AbstractMovieFactory


class ActionMovieFactory extends AbstractMovieFactory {
    @Override
    protected HollyWoodMovies getHollyWoodMovie() {
        return new HollyWoodAction();
    }

    @Override
    protected BullyWoodMovies getBullyWoodMovie() {
        return new BullyWoodAction();
    }
}//end of class ActionMovieFactory

class ComedyMovieFactory extends AbstractMovieFactory {
    @Override
    protected HollyWoodMovies getHollyWoodMovie() {
        return new HollyWoodComedy();
    }

    @Override
    protected BullyWoodMovies getBullyWoodMovie() {
        return new BullyWoodComedy();
    }
}//end of class ComedyMovieFactory

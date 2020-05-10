package com.georgidinov.builder.course;

class Director {

    //member variable , because the Director class may have other methods
    //which can use it, in this case is redundant
    private MealBuilder myMealBuilder;

    public void construct(MealBuilder builder) {
        this.myMealBuilder = builder;
        this.myMealBuilder.buildBurger();
        this.myMealBuilder.buildDrink();
    }//end of method construct

}//end of class Director

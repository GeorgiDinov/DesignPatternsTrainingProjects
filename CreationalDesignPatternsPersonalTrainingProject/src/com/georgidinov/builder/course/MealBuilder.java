package com.georgidinov.builder.course;

interface MealBuilder {

    void buildBurger();

    void buildDrink();

    Meal getMeal();

}//end of interface MealBuilder

class VegetarianMealBuilder implements MealBuilder {

    private final Meal meal = new Meal();

    @Override
    public void buildBurger() {
        this.meal.addItem(new VegetarianBurger());
    }

    @Override
    public void buildDrink() {
        this.meal.addItem(new PepsiCola());
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }

}//end of class VegetarianMealBuilder

class RegularMealBuilder implements MealBuilder {

    private final Meal meal = new Meal();

    @Override
    public void buildBurger() {
        this.meal.addItem(new RegularBurger());
    }

    @Override
    public void buildDrink() {
        this.meal.addItem(new CocaCola());
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }

}//end of class RegularMealBuilder

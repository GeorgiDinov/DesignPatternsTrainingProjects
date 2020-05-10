package com.georgidinov.builder.course;

class BuilderClient {

    public static void main(String[] args) {
        System.out.println("\n\t\t<<<Builder Design Pattern>>>\n");
        Director director = new Director();
        VegetarianMealBuilder vegetarianMealBuilder = new VegetarianMealBuilder();
        director.construct(vegetarianMealBuilder);
        Meal vegetarianMeal = vegetarianMealBuilder.getMeal();
        vegetarianMeal.showMeal();

        RegularMealBuilder regularMealBuilder = new RegularMealBuilder();
        director.construct(regularMealBuilder);
        Meal regularMeal = regularMealBuilder.getMeal();
        regularMeal.showMeal();

    }//end of main method

}//end of class BuilderClient

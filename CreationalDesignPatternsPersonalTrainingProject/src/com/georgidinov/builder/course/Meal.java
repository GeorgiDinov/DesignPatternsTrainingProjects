package com.georgidinov.builder.course;


import java.util.ArrayList;
import java.util.List;

class Meal {

    private final List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }//end of constructor

    public void addItem(Item item) {
        this.items.add(item);
    }//end of method addItem

    private double getTotalCost() {
        return this.items.stream().mapToDouble(Item::getPrice).sum();
    }//end of method getTotalCost

    private String menuType() {
        return this.items.stream()
                .anyMatch(item -> item.getName().equalsIgnoreCase("regular burger")) ?
                "Regular" : "Vegetarian";
    }

    public void showMeal() {
        System.out.println(menuType() + " Meal Items:");
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + items.get(i).getName() + " price: "
                    + items.get(i).getPrice() + " packed in " + items.get(i).getPacking().getPack());
        }
        System.out.println("Meal total cost: " +
                String.format("%.2f", getTotalCost()) + "\n");
    }//end of method showMeal

}//end of class Meal

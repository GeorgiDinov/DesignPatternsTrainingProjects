package com.georgidinov.composite;

//Class which plays Leaf Node(with no children) in our composite design pattern
//Mind that there is no data structure that can hold Faculty objects
class Professor implements Faculty {

    private final String name;
    private final String position;
    private final String phoneNumber;

    public Professor(String name, String position, String phoneNumber) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
    }//end of constructor

    @Override
    public String getDetails() {
        return "Name: " + this.name +
                ", Position: " + this.position +
                ", Phone Number: " + this.phoneNumber;
    }//end of method getDetails

}//end of leaf node class Professor

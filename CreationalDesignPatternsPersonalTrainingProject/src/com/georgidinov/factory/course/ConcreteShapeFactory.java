package com.georgidinov.factory.course;

//Also known as "concrete creator" approach
//avoiding subclassing by returning the desired type based on
//the passed parameter in this case a String
class ConcreteShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }//end of method getShape

}//end of class ConcreteShapeFactory

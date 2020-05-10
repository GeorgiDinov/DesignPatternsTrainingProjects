package com.georgidinov.decorator;

import java.sql.SQLOutput;

abstract class AbstractShapeDecorator implements DecoratorShape {
    protected DecoratorShape decoratorShape;

    public AbstractShapeDecorator(DecoratorShape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }//end of constructor

    @Override
    public void draw() {
        this.decoratorShape.draw();
    }//end of method draw

}//end of abstract class AbstractShapeDecorator

class ShapeBorderDecorator extends AbstractShapeDecorator {
    String borderColor;

    public ShapeBorderDecorator(DecoratorShape decoratorShape, String borderColor) {
        super(decoratorShape);
        this.borderColor = borderColor;
    }//end of constructor

    @Override
    public void draw() {
        System.out.println("\tBorder Color Is " + this.borderColor.toUpperCase());
        decoratorShape.draw();
        System.out.println("\t" + decoratorShape.getClass().getSimpleName() +
                " border is painted in " + this.borderColor+"\n");
    }//end of method draw

}//end of class ShapeBorderDecorator

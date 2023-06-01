package Exercises.Exercise6;

import java.lang.Math;

//TODO: create triangle class that extends BasicShape
public class Triangle extends BasicShape{
    //TODO: create 3 side variables
    private int side1;
    private int side2;
    private int side3;

    //TODO: create constructor taking in 3 variables for the sides
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //TODO: create calculateArea function
    // add the @Override annotation
    @Override
    public double calculateArea(){
        double semiPerimeter = (this.side1 + this.side2 + this.side3)/2.0;
        double area = Math.pow((semiPerimeter*(semiPerimeter-this.side1)*(semiPerimeter-this.side2)*(semiPerimeter-this.side3)),0.5);
        return Math.round(area*100.0)/100.0;
    }

    //TODO: create calculatePerimeter function
    // add the @Override annotation
    @Override
    public int calculatePerimeter(){
        return this.side1 + this.side2 + this.side3;
    }
}


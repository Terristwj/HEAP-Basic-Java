package Exercises.Exercise6;

//TODO: extend the BasicShape abstract class
public class Rectangle extends BasicShape{
    //TODO: create variable length
    protected int length;
    //TODO: create variable breadth
    protected int breadth;

    //TODO: create constructor that takes in length and breadth
    // assign length and breadth to the class variables
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    //TODO: create calculateArea function that returns area of the rectangle
    // add the @Override annotation
    @Override
    public double calculateArea(){
        return this.length * this.breadth;
    }

    //TODO: create calculatePerimeter function that returns perimeter of the rectangle
    // add the @Override annotation
    @Override
    public int calculatePerimeter(){
        return this.length*2 + this.breadth*2;
    }
}
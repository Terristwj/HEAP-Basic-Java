package Exercises.Exercise5;

public class Rectangle {
    //TODO: create variable length
    private final int length;
    //TODO: create variable breadth
    private final int breath;

    //TODO: create constructor that takes in length and breadth
    // assign length and breadth to the class variables
    public Rectangle(int length, int breath){
        this.length = length;
        this.breath = breath;
    } 

    //TODO: create calculateArea function that returns area of the rectangle
    protected int calculateArea(){
        return this.length*this.breath;
    }

    //TODO: create calculatePerimeter function that returns perimeter of the rectangle
    protected int calculatePerimeter(){
        return this.length*2 + this.breath*2;
    }
}

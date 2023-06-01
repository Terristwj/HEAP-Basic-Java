package Exercises.Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1, side2, side3;

        //TODO: prompt user to enter the length of rectangle and store it in a variable
        System.out.print("Enter a rectangle length: ");
        side1 = sc.nextInt();

        //TODO: prompt user to enter the breadth of rectangle and store it in a variable
        System.out.print("Enter a rectangle breath: ");
        side2 = sc.nextInt();
        //TODO: create rectangle object
        Rectangle myRect = new Rectangle(side1, side2);

        //TODO: print rectangle area
        System.out.println("Rectangle area: " + myRect.calculateArea());
        //TODO: print rectangle perimeter
        System.out.println("Rectangle perimeter: " + myRect.calculatePerimeter());
        System.out.println("");

        //TODO: prompt user to enter the length of square and store it in a variable
        System.out.print("Enter a square length: ");
        side1 = sc.nextInt();
        //TODO: create square object
        Square mySquare = new Square(side1);

        //TODO: print square area
        System.out.println("Square area: " + mySquare.calculateArea());
        //TODO: print square perimeter
        System.out.println("Square perimeter: " + mySquare.calculatePerimeter());
        System.out.println("");

        //TODO: prompt user to enter the side1 of triangle and store it in a variable
        System.out.print("Enter a triangle side1: ");
        side1 = sc.nextInt();
        //TODO: prompt user to enter the side2 of triangle and store it in a variable
        System.out.print("Enter a triangle side2: ");
        side2 = sc.nextInt();
        //TODO: prompt user to enter the side3 of triangle and store it in a variable
        System.out.print("Enter a triangle side3: ");
        side3 = sc.nextInt();
        //TODO: create triangle object
        Triangle myTriangle = new Triangle(side1, side2, side3);

        //TODO: print triangle area
        System.out.println("Triangle area: " + myTriangle.calculateArea());
        //TODO: print triangle perimeter
        System.out.println("Triangle perimeter: " + myTriangle.calculatePerimeter());

        sc.close();
    }
}


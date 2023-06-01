package Exercises.Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breath;

        //TODO: prompt user to enter the length and store it in a variable
        System.out.print("Enter length: ");
        length = sc.nextInt();

        //TODO: prompt user to enter the breadth and store it in a variable
        System.out.print("Enter breath: ");
        breath = sc.nextInt();
        sc.close();

        //TODO: initialize the rectangle object
        Rectangle myRect = new Rectangle(length, breath);

        //TODO: call function to calculate area and print
        System.out.println("Area: " + myRect.calculateArea());

        //TODO: call function to calculate perimeter
        System.out.println("Perimeter: " +myRect.calculatePerimeter());
    }
}

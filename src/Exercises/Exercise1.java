package Exercises;

import java.util.Scanner;
//TODO: import scanner

public class Exercise1 {
    public static void main(String[] args) {
        //TODO: create scanner
        Scanner sc = new Scanner(System.in);

        //TODO: prompt for user's name and store in a variable
        System.out.print("What is your name sir? ");
        String name = sc.nextLine();

        //TODO: prompt for user's weight and store in a variable
        System.out.print("And your weight? ");
        float weight = sc.nextFloat();

        //TODO: prompt for user's height and store in a variable
        System.out.print("Okay. Whats your height? ");
        float height = sc.nextFloat();

        //TODO: calculate BMI annd store in a variable
        // use weight divided by height squared
        float bmi = weight / (height * height);

        //TODO: print the result
        System.out.print("\n" + name + "! Your BMI is "+ bmi);

        //TODO: close scanner
        sc.close();
    }
}
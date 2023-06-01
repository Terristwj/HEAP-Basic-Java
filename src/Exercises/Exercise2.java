package Exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte myNum;
        boolean isDivisible;

        //TODO: prompt user to enter a number and store it in a variable
        System.out.print("Give me a number: ");
        myNum = sc.nextByte();

        //TODO: use an if statement to check if it is divisble by 3 & 5
        // print FizzBuzz if true
        isDivisible = false;

        //TODO: use an if statement to check if it is divisble by 3
        // print Fizz if true
        if (myNum % 3 == 0){
            isDivisible = true;
            System.out.print("Fizz");
        }

        //TODO: use an if statement to check if it is divisble by 5
        // print Buzz if true
        if (myNum % 5 == 0){
            isDivisible = true;
            System.out.print("Buzz");
        }

        //TODO: if all above are not true
        // print the number provided
        if (!isDivisible)
            System.out.print(myNum);

        sc.close();
    }
}
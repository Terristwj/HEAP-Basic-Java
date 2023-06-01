package Exercises;

import java.util.Scanner;

public class Exercise3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numStart, numEnd;
        boolean isDivisible;

        //TODO: prompt user to enter the starting number and store it in a variable
        System.out.print("Enter a starting number: ");
        numStart = sc.nextByte();

        //TODO: prompt user to enter the ending number and store it in a variable
        System.out.print("Enter an ending number: ");
        numEnd = sc.nextByte();

        //TODO: loop through from the starting to ending number
        //TODO: within the for loop, put the FizzBuzz logic
        while (numStart <= numEnd){
            //TODO: use an if statement to check if it is divisble by 3 & 5
            // print FizzBuzz if true
            isDivisible = false;

            //TODO: use an if statement to check if it is divisble by 3
            // print Fizz if true
            if (numStart % 3 == 0){
                isDivisible = true;
                System.out.print("Fizz");
            }

            //TODO: use an if statement to check if it is divisble by 5
            // print Buzz if true
            if (numStart % 5 == 0){
                isDivisible = true;
                System.out.print("Buzz");
            }

            //TODO: if all above are not true
            // print the number provided
            if (!isDivisible)
                System.out.print(numStart);

            System.out.println();
            numStart++;
        }
        sc.close();
    }
}
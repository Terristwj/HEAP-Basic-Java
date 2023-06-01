package Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        char myChar;

        //TODO: prompt user to enter the height and store it in a variable
        System.out.print("Give a height: ");
        height = sc.nextInt();

        //TODO: prompt user to enter the character and store it in a variable
        System.out.print("Give a char: ");
        myChar = sc.next().charAt(0);
        sc.close();

        //TODO: call the function to print shape
        printShape(height, myChar);
    }

    //TODO: given height and character create function to print
    // use for loop
    private static void printShape(int height, char myChar){
        int iter = height;
        while (iter >= 0){
            for (int i=height; i>iter; i--)
                System.out.print(" ");

            for (int j=0; j<=iter; j++)
                System.out.print(myChar);
            
            System.out.println();
            iter--;
        }
    }
}

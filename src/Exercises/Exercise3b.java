package Exercises;

import java.util.Scanner;

public class Exercise3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        char myChar;

        //TODO: prompt user to enter the height and store it in a variable
        System.out.print("Give me your height: ");
        height = sc.nextInt();

        //TODO: prompt user to enter the character and store it in a variable
        System.out.print("Type a char: ");
        myChar = sc.next().charAt(0);

        //TODO: for loop logic to print the inverted triangle
        /*
        height of 4
        character of @
        output:
        @@@@
         @@@
          @@
           @
         */
        int iter = height;
        while (iter >= 0){
            for (int i=height; i>iter; i--)
                System.out.print(" ");

            for (int j=0; j<=iter; j++)
                System.out.print(myChar);
            
            System.out.println();
            iter--;
        }
        sc.close();
    }
}
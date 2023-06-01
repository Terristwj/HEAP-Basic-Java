package Exercises;

import java.util.Scanner;

public class Exercise3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        //TODO: prompt user to enter a string and store it in a variable
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        sc.close();

        //TODO: check if it is a palindrome
        if (isPalindrome(str))
            System.out.print("Is palindrome");
        //TODO: else print false
        else
            System.out.print("Not palindrome");
    }

    //TODO: if it is palindrome, print true
    private static boolean isPalindrome(String str){
        int length = str.length();
        for (int i=0; i<length/2; i++)
            if (str.charAt(i) != str.charAt(length -1 -i))
                return false;

        return true;
    }
}
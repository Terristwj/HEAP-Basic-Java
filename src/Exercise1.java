//TODO: import scanner
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //TODO: create scanner
        Scanner sc = new Scanner(System.in);

        //TODO: prompt for user's name and store in a variable
        System.out.print("Give me your name:\t");
        String name = sc.nextLine();

        //TODO: prompt for user's weight and store in a variable
        System.out.print("Now your weight:\t");
        float weight = sc.nextFloat();

        //TODO: prompt for user's height and store in a variable
        System.out.print("Height?\t\t");
        float height = sc.nextFloat();

        //TODO: calculate BMI annd store in a variable
        // use weight divided by height squared
        float bmi = weight/(height*height);

        //TODO: print the result
        System.out.print(name + ", youe BMI is:\t" + bmi);
        sc.close();
    }
}

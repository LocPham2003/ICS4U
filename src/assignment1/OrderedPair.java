package assignment1;

import java.util.Scanner;

/**
 * 5/ Write a program that would allow the user to enter any real number for x and would output an ordered pair (x,y) where y=2x^3-5x^2+3x-4 .
 * Please round to 2 decimal places.
 *
 * @author  Loc Pham
 * @version 1.0
 * @since   2020-11-26
 */

public class OrderedPair {

    //We will create a function f that takes x as its parameter, and produce a y value.
    static double f(double x){
        //The x value once passed in the parameter will undergo the following calculation, which returns a corresponding y value
        return 2 * Math.pow(x,3) - 5 * Math.pow(x,2) + 3 * x - 4;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //We get the user input for x
        System.out.print("Please enter your x value: ");
        double x = scanner.nextDouble();

        scanner.close();

        //Once we get the value of x, we will call function f to get our y value. Since f(double x) return a double value, we will declare a new variable and store it there
        double y = f(x);

        //Print out our x and y values as the following format: (x,y)
        System.out.printf("(%.2f,%.2f)", x,y);
    }
}

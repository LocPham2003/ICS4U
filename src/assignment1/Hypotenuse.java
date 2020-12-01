package assignment1;

import java.util.Scanner;

/**
 * 4/ Create a program that asks the user to enter the  Lengths of the two sides adjacent to a right angle in a right angled triangle.
 * The program will  calculate the length of the Hypotenuse and output the lengths of all three sides rounded to three decimal places
 *
 * @author  Loc Pham
 * @version 1.0
 * @since   2020-11-26
 */

public class Hypotenuse {
    public static void main(String[] args) {

        //Declare variables for adjacent sides
        double adjacent1;
        double adjacent2;

        Scanner scanner = new Scanner(System.in);

        //Get the value of 2 adjacent sides from the user
        System.out.print("Please input the value of adjacent side 1: ");
        adjacent1 = scanner.nextDouble();

        System.out.print("Please input the value of adjacent side 2: ");
        adjacent2 = scanner.nextDouble();

        scanner.close();

        //Using pythagorean theorem, the hypotenuse can be calculated as following:
        //sqrt(a^2 + b^2), a and b are two adjacent sides in a right angled triangle

        double hypotenuse = Math.sqrt(Math.pow(adjacent1,2) + Math.pow(adjacent2, 2));

        System.out.printf("The hypotenuse is: %.3f", hypotenuse);
    }

}

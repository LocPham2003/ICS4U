package assignment1;

import java.util.Scanner;

/**
 * 6/ Write a program to allow the user the length of the base and height of a triangle.
 * The program will calculate the area rounded to 2 decimal places.
 *
 * @author  Loc Pham
 * @version 1.0
 * @since   2020-11-26
 */



public class TriangleArea {
    public static void main(String[] args) {

        double baseLength;
        double height;

        Scanner input = new Scanner(System.in);

        //Get the value of base length and height through user's input
        System.out.print("Please enter your base length: ");
        baseLength = input.nextDouble();
        System.out.print("Please enter your height: ");
        height = input.nextDouble();

        input.close();

        //The area of the triangle can be calculated with the following formula: (baseLength * height) / 2
        double area = (baseLength * height) / 2;

        System.out.printf("The area of the triangle is: %.2f", area);


    }
}

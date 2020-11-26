package assignment1;

import java.util.Scanner;

/**
 * The following program asks the user for the names of
 * three sports teams and the sport that they play.
 * Output the information in chart form with title.
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

        //The area of the triangle can be calculated with the following formula: (baseLength * height) / 2
        double area = (baseLength * height) / 2;

        System.out.printf("The area of the triangle is: %.2f", area);


    }
}

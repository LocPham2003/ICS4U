package assignment1;

import java.util.Scanner;

/**
 * 1/Create a program that converts gallons to liters.
 * The program will ask the user for the amount of gallons and then the program will display the equivalent in Liters.
 * There are 3.7854 liters in a gallon.
 * The program displays both the number of gallons and the equivalent number of liters rounded to 2 decimal places.
 *
 * @author  Loc Pham
 * @version 1.0
 * @since   2020-11-25
 */

public class GallonsToLiters {

    //Universal constant of the number of liters to one gallon
    private static final double litersToGallon = 3.7854;

    //Takes number of gallons and convert to liters
    static double convert(double gallons){

        //return the number of liters that has been converted
        return gallons * litersToGallon;
    }

    public static void main(String[] args) {
        //This check the status to see if the program should stop or not
        int isUserExit = 0;

        Scanner input = new Scanner(System.in);
        Scanner exit = new Scanner(System.in);

        //We have a loop here so that the user can repeatedly use the program and exit on command
        while(isUserExit == 0) {


            System.out.print("Enter number of gallons: ");

            //Store input gallons in a variable for further uses.
            double inputGallons = input.nextDouble();

            //Store converted liters in a variable for further uses
            double liters = convert(inputGallons);

            //Using two stored variables above, we can now format our output using printf
            System.out.printf("%.2f %s %.2f %s%n%n", inputGallons, "gallons is", liters, "Liters.");

        /*An alternate and simpler way is:

        System.out.println(inputGallons + " gallons is " + liters + " Liters.");

         */

            //Ask for the user decision to exit the program
            System.out.println("Do you want to exit? 1 - Yes, 0 - No ");
            System.out.print("-> ");
            isUserExit = exit.nextInt();
            System.out.println();

        }

        input.close();

    }
}

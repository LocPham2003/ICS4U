package assignment1;

import java.util.Scanner;

/**
b)  The formula in part (a) can be adjusted to calculate what principal will need to be invested in order to have a certain amount of money after a specified term and interest rate:
 * Principal  = Amount  / (1  + years  * interest  rate).
 * Modify SimpleInterest to prompt the user for the desired amount, number of years, and interest rate and then calculate the principal that will need to be invested.
 *
 * @author  Loc Pham
 * @version 1.0
 * @since   2020-11-26
 * */
public class SimpleInterestPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declare essential variables
        double amount;
        double numberOfYears;
        double interestRate;

        //Get the input from the user
        System.out.print("Enter the amount: ");
        amount = input.nextDouble();

        System.out.print("Enter the number of years: ");
        numberOfYears = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        interestRate = input.nextDouble();

        input.close();

        //The principal that needs to be invested can be calculated as: Principal  = Amount  * (1  + years  * interest  rate)
        double principal = amount / (1 + numberOfYears * interestRate);

        //Print out the amount
        System.out.printf("The amount of money that needs to be invested is: $%.2f",principal);
    }
}

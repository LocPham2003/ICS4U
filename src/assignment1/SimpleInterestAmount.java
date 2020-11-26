package assignment1;

import java.util.Scanner;

/**
 * There are two kinds of interest: simple and compound. With simple interest, the amount of the deposit remains the same, and the amount of interest is paid at the end of a time interval.
 * For example, if $1,000 is deposited for 7 years at an interest rate of 6% per year, $60 will be deposited at the end of each year, for a total of $1,420 after 7 years.
 *
 * a)  The value of the amount after the term is calculated using the formula:
 *
 * Amount  = Principal  * (1  + years  * interest  rate)
 *
 * Create a SimpleInterest application that prompts the user for the principal, number of years, and the interest rate (as a fraction) and then calculates the amount of interest.
 *
 * @author  Loc Pham
 * @version 1.0
 * @since   2020-11-26
 */

public class SimpleInterestAmount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declare essential variables
        double principal;
        double numberOfYears;
        double interestRate;

        //Get the input from the user
        System.out.print("Enter the principal: ");
        principal = input.nextDouble();

        System.out.print("Enter the number of years: ");
        numberOfYears = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        interestRate = input.nextDouble();

        input.close();

        //The amount after term is calculated as: Amount  = Principal  * (1  + years  * interest  rate)
        double amount = principal * (1 + numberOfYears * interestRate);

        //Print out the amount
        System.out.printf("The value after the term is: $%.2f",amount);

    }
}

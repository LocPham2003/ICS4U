package assignment2;

import java.util.Scanner;

/**
 * The following program has a method sumThis(x, n) with parameters X and N and calculates the sum as the following format:
 * X - X^2 + X^3 - X^4 + ... - X^2N, and display the sum as a standard output
 *
 * @author Loc Pham
 * @version 1.0
 * @since 2020-12-06
 */

class SumThis {
    /**
     The following method will take two parameters X and N, and print the calculated the sum as the following formula:
     X - X^2 + X^3 - X^4 + ... - X^2N.
     @param x - The first parameter of sumThis method
     @param n - The second parameter of sumThis method
     */

    static void sumThis(double x, int n){
        double sum = 0;

	/* The following loop will calculate the sum based on the formula provided above. If the exponent is an odd
	number then the sum will add that upcoming value, if not then it will subtract the upcoming value.
	*/

        for (int i = 1; i <= (2 * n); i++){
            double upcomingValue = Math.pow(x, i);
            if (i % 2 == 0){
                sum -= upcomingValue;
            } else {
                sum += upcomingValue;
            }
        }

        System.out.println("The sum is: " + sum);
    }

    /**
     The main method takes the input of the user, which makes use of the sumThis() method
     @param args Unused.
     @return nothing
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the value of x: ");
        double x = input.nextDouble();

        System.out.print("\n" + "Please enter the value of n: ");
        int n = input.nextInt();

        input.close();

        sumThis(x,n);

    }
}
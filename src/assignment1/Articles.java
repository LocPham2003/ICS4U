package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create a program that asks for the customer’s name.
 * Enter the price of 10 articles the customer has purchased.
 * Calculate HST and the total cost after taxes.
 * Properly space each piece of information to create a sales receipt with the customer’s name in ALL upper case.
 *
 * @author  Loc Pham
 * @version 1.0
 * @since   2020-11-26
 */

public class Articles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Create an ArrayList to store entered articles' prices
        ArrayList<Double> articles = new ArrayList<>();

        System.out.print("Please enter your name: ");
        String customerName = input.nextLine();

        //Loop that iterates 10 times to ask for the price of 10 articles
        for (int i = 1; i <= 10; i++){
            System.out.print("Enter article " + i + " price: " );

            double price = input.nextDouble();

            //Store the input price into the array for further usage
            articles.add(price);
        }

        input.close();

        //A println here so the receipt can be easily seen
        System.out.println();

        //Print the beginning of the receipt (Customer's name and column names)
        System.out.printf("%S: %S%n","Customer's name ", customerName);
        System.out.printf("%-10S %20S%n", "Product", "Price");

        //This will store the total price of all articles before tax
        double sum = 0;

        //Indicate which number is the article in the receipt
        int articleNumber = 0;

        //Print the price of each articles as a receipt
        for (Double i : articles){

            System.out.printf("%-10S %20.2f%n", "Article " + articleNumber, i);

            //Add up all articles' prices to make a sum
            sum += i;

            //Update the current article number -> make sure the next one number is 1 unit higher
            articleNumber++;
        }

        //The HST can be calculated as: Total before tax / 100 * 13
        double hst = sum / 100 * 13;
        //Total price with tax is the sum of all articles' prices and hst
        double totalPriceWithTax = sum + hst;

        System.out.printf("%15S: %.2f%n", "hst", hst);
        System.out.printf("%15S: %.2f%n", "total price", totalPriceWithTax);

    }


}

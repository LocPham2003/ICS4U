package assignment2;

import java.util.Scanner;

/**
 * The following program computes the sum of all the elements of the array.
 * The program also work even if the dimensions of the rows and columns are changed
 *
 * @author Loc Pham
 * @version 1.0
 * @since 2020-12-06
 */

class AddArray {

    /**
     The following method will calculate the sum of all the elements in the array and print out that sum
     @param arr The first parameter of the addArray method
     */
    static void addArray(int[][] arr){
        int sum = 0;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }

        System.out.println("The sum of all the elements in the array is: " + sum);
    }

    /**
     The main method takes the input of the user, which makes use of the addArray() method
     @param args Unused.
     @return nothing
     */

    public static void main(String[] args) {
        int index = 0;

        System.out.println("Please enter all values of the row as the following format: value1 value2 value3");

        Scanner input = new Scanner(System.in);

        System.out.print("\n" + "Please enter the number of rows you want your array to have: ");
        int row = input.nextInt();

        //The array whose values will be used to calculate sum
        int[][] data = new int[row][];

        while (index < row){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter all values of row " + index + ": ");

            String inputValues = scanner.nextLine();

            //Convert all values the user put in into an array of Strings
            String[] values = inputValues.split(" ");

            int[] arr = new int[values.length];

            //Parse values in the array of user input String into Integers
            for (int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(values[i]);
            }

            data[index] = arr;

            index++;
        }

        addArray(data);

    }
}
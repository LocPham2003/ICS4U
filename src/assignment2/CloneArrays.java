package assignment2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The following program uses cloneArray method that takes a 2D  array of
 * integers as a parameter, creates a new array that is the same size, copies the
 * elements from the first array into the new one, and then returns a reference
 * to the new array.
 *
 * @author Loc Pham
 * @version 1.0
 * @since 2020-12-06
 */

class CloneArrays {

    /**
     * The following method will take a 2D array through its parameter and
     * replicates that array.
     *
     * @param arr: This is the first parameter of cloneArray method
     * @return a 2D array
     */
    static int[][] cloneArray(int [][] arr){
        int[][] cloned2DArr = new int[arr.length][];

        for (int i = 0; i < arr.length; i++){
            cloned2DArr[i] = arr[i];
        }

        return cloned2DArr;

    }

    /**
     The main method takes the input of the user, which makes use of the topRunner() method and
     the runnerData() method
     @param args Unused.
     @return nothing
     */
    public static void main(String[] args) {
        int index = 0;

        System.out.println("Please enter all values of the row as the following format: value1 value2 value3");

        Scanner input = new Scanner(System.in);

        System.out.print("\n" + "Please enter the number of rows you want your array to have: ");
        int row = input.nextInt();

        //The array whose values will be cloned
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

        System.out.println(Arrays.deepToString(cloneArray(data)));
    }
}
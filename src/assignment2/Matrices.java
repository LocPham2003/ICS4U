package assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The following program uses addMatrices() method that constructs 2 matrices out of the number of rows and columns
 * the user specifies and then asks the user to enter in the values. A Menu option which includes
 * addition and subtraction is also available. The user input and option will prompt the program to subtract or
 * add two matrices accordingly
 *
 * The program also use the method multMatrices() that constructs 2 matrices out of the number of rows and columns
 * the user specifies and then asks the user to enter in the values. This method will produce a product of two matrices
 *
 * @author Loc Pham
 * @version 1.0
 * @since 2020-12-06
 */

class Matrices {

    /**
     * The following function takes the user input and creates matrices as two dimensional arrays
     * accordingly
     *
     * @return CreatedMatrices This returns an object of CreatedMatrices class
     */
    static CreatedMatrices createMatrices(String currentOperation){
        int row, row2;
        int column, column2;

        System.out.println("Remember, ALL rows and columns must be greater than 0");

	/*
	The following loop will take the user input and check if the dimension of the provided matrix is acceptable to perform calculations.
	The loop will continuously iterate until the dimension of the matrix is suitable for calculation.
	*/
        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter the number of rows of matrix 1: ");
            row = scanner.nextInt();

            System.out.print("Please enter the number of columns of matrix 1: ");
            column = scanner.nextInt();

            System.out.print("\n" + "Please enter the number of rows of matrix 2: ");
            row2 = scanner.nextInt();

            System.out.print("Please enter the number of columns of matrix 2: ");
            column2 = scanner.nextInt();

            /*
            Check if the number of rows and columns of both matrices are valid for calculation

            Add/ Subtract: rows and columns of both matrices must be the same
            Multiply: number of columns of the first matrix must be equal to the number of rows of the second matrix

             */
            if ((currentOperation.equals("adding") || currentOperation.equals("subtracting"))){
                if (!(row == row2 && column == column2)){
                    System.out.println("Invalid matrices dimension for " + currentOperation + ", please try again!");
                } else {
                    System.out.println("Valid matrices dimension, please proceed to input values into these matrices" + "\n");
                    System.out.println("Please input the value as the following format: value1 value2 value3 (e.g 1 2 3)");
                    break;
                }
            } else {
                if (!(column == row2 || column2 == row)){
                    System.out.println("Invalid matrices dimension for " + currentOperation + ", please try again!");
                } else {
                    System.out.println("Valid matrices dimension for " + currentOperation + ", please proceed to input values into these matrices"  + "\n");
                    System.out.println("Please input the value as the following format: value1 value2 value3 (e.g 1 2 3)");
                    break;
                }
            }
        }

        ArrayList<String> valuesOfMatrix1 = new ArrayList<>();
        ArrayList<String> valuesOfMatrix2 = new ArrayList<>();

        /*The following loop will takes the user input to create values for matrices. If the number of values
        that has been input exceed the acceptable columns, the loop will signal a warning and ask the user to input again.
         */
        for (int j = 1; j <= 2; j++){
            Scanner input = new Scanner(System.in);

            int currentMatrixRow;
            int currentMatrixColumn;

            if (j == 1){
                currentMatrixRow = row;
                currentMatrixColumn = column;
            } else {
                currentMatrixColumn = column2;
                currentMatrixRow = row2;
            }

            for (int i = 0; i < currentMatrixRow; i++){
                System.out.print("Please enter " + currentMatrixColumn + " values for row " + i + " of matrix " + j + " ");
                String values = input.nextLine();

                System.out.println();

                //Format the values of input and put them in arrayLists.
                String[] listOfValues = values.split(" ");

                if (listOfValues.length == currentMatrixColumn) {
                    if (j == 1){
                        valuesOfMatrix1.addAll(Arrays.asList(listOfValues));
                    } else {
                        valuesOfMatrix2.addAll(Arrays.asList(listOfValues));
                    }
                } else {
                    System.out.println("Invalid number of values in this row, please input again!");
                    i--;
                }


            }

            System.out.println();
        }

        /*
        Putting values created from user input into proper 2D array format
         */
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row2][column2];

        for (int j = 1; j <= 2; j++){
            int currentMatrixRow;
            int currentMatrixColumn;

            if (j == 1){
                currentMatrixRow = row;
                currentMatrixColumn = column;
            } else {
                currentMatrixColumn = column2;
                currentMatrixRow = row2;
            }
            for (int i = 0; i < currentMatrixRow; i++){
                for (int k = 0; k < currentMatrixColumn; k++){
                    if (j == 1){
                        matrix1[i][k] = Integer.parseInt(valuesOfMatrix1.get(i * currentMatrixColumn + k));
                    } else {
                        matrix2[i][k] = Integer.parseInt(valuesOfMatrix2.get(i * currentMatrixColumn + k));
                    }
                }
            }
        }

        return new CreatedMatrices(matrix1, matrix2, row, column, row2, column2);
    }

    /**
     * The following function will add two matrices that has been created by calling the createMatrices() method.
     *
     * @return none
     */
    static void addMatrices(){
        System.out.println("You have selected addMatrices");

        CreatedMatrices createdMatrices = createMatrices("adding");

        /*
        To add matrices, we take the values at a index of this matrix and add it to the value of the other matrix at a similar index.

        The following loop will iterates through all values of the first matrix and add it with all values
        of the second matrix.
         */
        for (int i = 0; i < createdMatrices.getRow(); i++){
            for (int j = 0; j < createdMatrices.getColumn(); j++){
                System.out.print(createdMatrices.getMatrix1()[i][j] + createdMatrices.getMatrix2()[i][j] + " ");
            }
            System.out.println();
        }


    }

    /**
     * The following function will subtract two matrices that has been created by calling the createMatrices() method.
     *
     * @return none
     */
    static void subtractMatrices(){
        System.out.println("You have selected subtract matrices");

        CreatedMatrices createdMatrices = createMatrices("subtracting");

        /*
        To subtract matrices, we take the values at a index of this matrix and subtract it to the value of the other matrix accordingly.

        The following loop will iterates through all values of the first matrix and subtract it with all values
        of the second matrix.
         */
        for (int i = 0; i < createdMatrices.getRow(); i++){
            for (int j = 0; j < createdMatrices.getColumn(); j++){
                System.out.print(createdMatrices.getMatrix1()[i][j] - createdMatrices.getMatrix2()[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * The following function will multiply two matrices that has been created by calling the createMatrices() method.
     *
     * @return none
     */
    static void multMatrices(){
        System.out.println("You have selected multiplying matrices");

        CreatedMatrices createdMatrices = createMatrices("multiplying");

        int[][] matrix1 = createdMatrices.getMatrix1();
        int[][] matrix2 = createdMatrices.getMatrix2();

        /*
        In order to multiply matrices, we take the values in columns of one matrix and multiply with the values
        in rows of the other one.

        The following loop will iterates through all values in columns of the first matrix and multiply it with all values
        in rows of the second matrix.
         */

        for (int[] i : matrix1){
            for (int j = 0; j < createdMatrices.getColumn2(); j++){
                int product = 0;
                for (int k = 0; k < i.length; k++){
                    product += i[k] * matrix2[k][j];
                }
                System.out.print(product + " ");
            }
            System.out.println();
        }

    }

    /**
     The main method takes the input of the user, which makes use of the multiMatrices() method,
     the addMatrices() method, and the subtractMatrices() method.
     @param args Unused.
     @return nothing
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Would you like to add(+), subtract(-), or multiply(x) matrices ? ");

        String answer = userInput.next();

        //Check the input of the user and carryout calculation accordingly
        switch (answer) {
            case "+" -> addMatrices();
            case "-" -> subtractMatrices();
            case "x", "X" -> multMatrices();
            default -> System.out.println("No such mathematical operation is found, thank you for using our program");
        }

    }
}

/**
 * This is a createdMatrices class, which stores all the matrices that has been
 * created by the user input, and then be used later on for adding and subtracting purposes
 *
 * Constructor has the following @params:
 * matrix1: store the first matrix
 * matrix2: store the second matrix
 * row: store number of rows shared between both matrices
 * column: store number of columns shared between both matrices
 *
 * pre: none
 * post: A CreatedMatrices object created, matrix1, matrix2, row, column, row2, column2 2 are initialized based on the values passed inside that parameter
 */

class CreatedMatrices{
    int[][] matrix1;
    int[][] matrix2;

    int row;
    int column;

    int row2;
    int column2;

    public CreatedMatrices(int[][] matrix1, int[][] matrix2, int row, int column, int row2, int column2){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;

        this.row = row;
        this.column = column;

        this.row2 = row2;
        this.column2 = column2;
    }
    /**
     * Returns the values of matrix 1.
     * pre: none
     * post: The values of matrix1 has been returned.
     */
    public int[][] getMatrix1() {
        return matrix1;
    }

    /**
     * Returns the values of matrix 2.
     * pre: none
     * post: The values of matrix1 has been returned.
     */
    public int[][] getMatrix2() {
        return matrix2;
    }

    /**
     * Returns the number of columns of matrix1.
     * pre: none
     * post: The number of columns of matrix1 has been returned.
     */
    public int getColumn() {
        return column;
    }

    /**
     * Returns the number of row of matrix1.
     * pre: none
     * post: The number of row of matrix1 has been returned.
     */
    public int getRow() {
        return row;
    }

    /**
     * Returns the number of row of matrix2.
     * pre: none
     * post: The number of row of matrix2 has been returned.
     */
    public int getRow2() {
        return row2;
    }

    /**
     * Returns the number of columns of matrix2.
     * pre: none
     * post: The number of columns of matrix2 has been returned.
     */
    public int getColumn2() {
        return column2;
    }
}

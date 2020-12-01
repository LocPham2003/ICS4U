package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2/The following program asks the user for the names of
 * three sports teams and the sport that they play.
 * Output the information in chart form with title.
 *
 * @author  Loc Pham
 * @version 1.0
 * @since   2020-11-25
 */


public class SportTeams {


    public static void main(String[] args) {
        //Display input requirements and instructions for users to follow
        System.out.println("Please follow the following format when input data");
        System.out.printf("-%S-%S-%n", "Team Name", "Sport they play");

        System.out.println("Example: Maple Leafs-Hockey" + "\n");

        //Creates two ArrayList instances to store sport teams and what they play
        ArrayList<String> sportTeam = new ArrayList<>();
        ArrayList<String> sportTheyPlay = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        //Loop the iterate 3 times, corresponding to 3 inputs
        for (int i = 0; i <= 2; i++){

            System.out.print("Enter sport team and the sport they play: ");

            //Gather input data from user and store it in this variable
            String inputData = input.nextLine();

            //The variable above is then split into two components, stored in the following array.
            //The first index of the array will be the team name, the second index will be the sport they play
            String[] splitData = inputData.split("-");

            /*This is put into a try-catch block because we want to check if the input data is valid

            If the input data is not valid, or does not follow the input format, the splitData array will only
            have the length of 1, which makes splitData[1] to be out of bounds.

            Therefore, the try-catch block enables the program to inform the user if their input data is incorrect, without crashing the program

             */
            try {
                //Append the processed data into their corresponding lists.
                sportTeam.add(splitData[0]);
                sportTheyPlay.add(splitData[1]);
            } catch (Exception e){
                //Print out warning to notify the user that the input is incorrect
                System.out.println("ERROR! Invalid input, please try again!");

                //Remove the latest added sport team because there is no corresponding sport that they play to accompany it
                sportTeam.remove(splitData[0]);

                //Subtract i by 1 to collect the input again
                i--;
            }
        }

        input.close();

        System.out.println();

        //Format the input data into a chart
        //Chart title
        System.out.printf("%25s%n", "-DATA CHART-");

        //Category Title
        System.out.format("%-20s %20s\n", "Team", "Sport Type");

        //Loop through the content of the chart and print them out accordingly
        for (int i = 0; i <= sportTeam.size() - 1; i++){
            //Get the sport team and the sport they play from two arrayLists created above, whose data has been updated through the loop that collect the user's input
            System.out.format("%-20s %20s\n", sportTeam.get(i), sportTheyPlay.get(i));
        }

    }
}

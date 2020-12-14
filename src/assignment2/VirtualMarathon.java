package assignment2;

import java.util.Scanner;

/**
 * The following program store participants' full names, time to finish the run and years participated in the Virtual Marathon competition.
 * The program will store data in a runnerData() method, find the fastest runner in the topRunner() method and allow users to identify a participant's information
 * in the competition by typing their last name, as well as finding the fastest runner,
 *
 * @author Loc Pham
 * @version 1.0
 * @since 2020-12-06
 */

class VirtualMarathon {
    /**
     The following function stores the data of the chart in an array of objects. Each object has its own properties such as firstName, lastName, time and years.
     @param inputLastName: The first parameter to runnerData method
     @param isCallingFromTopRunners: The second parameter to runnerData method
     @return Runner[] This returns an array of Runner objects
     */
    static Runner[] runnerData(String inputLastName, boolean isCallingFromTopRunners){
        Runner[] listOfRunners = {
                new Runner("Scott", "Parson",341,1),
                new Runner("Kara", "Elor",273,2),
                new Runner("Blake", "Griffin", 278,5),
                new Runner("Samantha", "Small", 329, 7),
                new Runner("Paul", "George",445,9),
                new Runner("Mike","Wax", 275,3),
                new Runner("Sue", "Pozzoto", 275,4),
                new Runner("Jose","Atlimore", 243,1),
                new Runner("Nera", "Garshi",334,1),
                new Runner("Jane", "Ostin",412,1),
                new Runner("Emma", "Cary",393,4),
                new Runner("Dave", "Ham", 299,4),
                new Runner("Neda", "Bazdar", 343,3),
                new Runner("Asher", "Smith", 317, 6),
                new Runner("Kaleb", "Henor", 265,8),
                new Runner("Jeff", "Big", 288,7),
                new Runner("Kingsley", "Duff", 249,3),
                new Runner("Bob", "Wright", 350,3),
                new Runner("Jennifer", "McCall", 280,5),
                new Runner("Jimmy", "Smooth", 262,7)
        };

        String identifiedRunner;

        int j;

        for (j = 0; j < listOfRunners.length; j++) {
            Runner i = listOfRunners[j];
            if (i.lastName.equalsIgnoreCase(inputLastName)) {
                identifiedRunner = i.firstName + " " + i.lastName + ", marathon time: " + i.time + ", years participated: " + i.years;
                System.out.println(identifiedRunner + "\n");
                break;
            }
        }

        if (j == listOfRunners.length && !isCallingFromTopRunners){
            System.out.println("There is no runner whose last name is: " + inputLastName + "\n");
        }

        return listOfRunners;
    }

    /**
     The following function will sort the list of runners' time to find who is the fastest runner.
     @return String This returns the name of the fastest runner
     */
    static String topRunner(){
        Runner[] getListOfRunners = runnerData("", true);

        int fastestTime = 10000;
        int fastestTimeIndex = -1;

        //Find which is the fastest time
        for (int i = 0; i < getListOfRunners.length; i++) {
            if (getListOfRunners[i].time < fastestTime) {
                fastestTime = getListOfRunners[i].time;
                fastestTimeIndex = i;
            }
        }

        return getListOfRunners[fastestTimeIndex].getName();
    }



    /**
     The main method takes the input of the user, which makes use of the topRunner() method and
     the runnerData() method
     @param args Unused.
     @return nothing
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the last name of the runner you want to find: ");
        runnerData(input.next(), false);

        System.out.print("Would you like to see the fastest runner? Y/N ");

        String collectedAnswer = input.next();

        if (collectedAnswer.equalsIgnoreCase("Y")){
            System.out.println("The fastest runner is: " + topRunner());
        } else {
            System.out.println("Thank you for your answer!");
        }
    }
}

/**
 * The following class is a Runner class. This class contains all properties of the runner in the Virtual Marathon
 * competition. Each time an object is created, it will have all of these information (lastName, firstName, time, year) which can
 * be used later on by the user.
 * pre: non
 * post: A Runner object is created. All parameters of the constructor (firstName, lastName, time, years) will be  * created for that object.
 */
class Runner {
    String firstName;
    String lastName;
    int time;
    int years;

    Runner(String firstName, String lastName, int time, int years){
        this.firstName = firstName;
        this.lastName = lastName;
        this.time = time;
        this.years = years;
    }

    public String getName(){
        return firstName + " " + lastName;

    }
}

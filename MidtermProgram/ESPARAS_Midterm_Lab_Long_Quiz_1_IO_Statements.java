/* Author: Adolfo I G. Esparas
 * Section: BCS11
 * Date: September 22, 2022
 * Mentor: Miss Sherry Naz
 */

//Import Scanner into the program
import java.util.Scanner;

public class ESPARAS_Midterm_Lab_Long_Quiz_1_IO_Statements {
    public static void main(String[] args) {
        //Declare scanner variable
        Scanner console = new Scanner(System.in);

        //Initiate variables of enabling assessment grades
        float enab1;
        float enab2;
        float enab3;
        float enab4;
        //Initiate variables of summative assessment grades
        float sum1;
        float sum2;
        //Initiate variables of class participation grades
        float part1;
        float part2;
        float part3;
        //Declare char variable for the confirmation of retrying the process
        char conf;

        //(Optional) Do-While is used for coding the repeating process of the program for user's efficiency.
        do {
            //Welcome message to user. Instructing to input grades.
            System.out.println("Please Enter Grades for:\n");

            //User inputs grade to Enabling Assessments and declare it to assigned variables
            System.out.print("Enabling Assessment 1: ");
            enab1 = console.nextFloat();

            /*This code is used to limit the user input to 0.0 - 100.0 only.
              If the user inputs >0 or <100, they will be prompt by a message, "Please input value 0.0 - 100.0 only.", and repeat the inputting process. */
            while (enab1 > 100 || enab1 < 0) {
                System.out.println("Please input value 0.0 - 100.0 only.");
                enab1 = console.nextFloat();    //stores value inputted by user to its corresponding variable.
            }
            System.out.print("Enabling Assessment 2: ");
            enab2 = console.nextFloat();
            while (enab2 > 100 || enab2 < 0) {
                System.out.println("Please input value 0.0 - 100.0 only.");
                enab2 = console.nextFloat();
            }
            System.out.print("Enabling Assessment 3: ");
            enab3 = console.nextFloat();
            while (enab3 > 100 || enab3 < 0) {
                System.out.println("Please input value 0.0 - 100.0 only.");
                enab3 = console.nextFloat();
            }
            System.out.print("Enabling Assessment 4: ");
            enab4 = console.nextFloat();
            while (enab4 > 100 || enab4 < 0) {
                System.out.println("Please input value 0.0 - 100.0 only.");
                enab4 = console.nextFloat();
            }

            //User inputs grade to Summative Assessments and declare it to assigned variables
            System.out.print("\nSummative Assessment 1: ");
            sum1 = console.nextFloat();
            while (sum1 > 100 || sum1 < 0) {
                System.out.println("Please input value 0.0 - 100.0 only.");
                sum1 = console.nextFloat();
            }
            System.out.print("Summative Assessment 2: ");
            sum2 = console.nextFloat();
            while (sum2 > 100 || sum2 < 0) {
                System.out.println("Please input value 0.0 - 100.0 only.");
                sum2 = console.nextFloat();
            }

            //User inputs grade to Class Participation and declare it to assigned variables
            System.out.print("\nClass Participation 1: ");
            part1 = console.nextFloat();
            while (part1 > 100 || part1 < 0) {
                System.out.println("Please input value 0.0 - 100.0 only.");
                part1 = console.nextFloat();
            }
            System.out.print("Class Participation 2: ");
            part2 = console.nextFloat();
            while (part2 > 100 || part2 < 0) {
                System.out.println("Please input value 0.0 - 100.0 only.");
                part2 = console.nextFloat();
            }
            System.out.print("Class Participation 3: ");
            part3 = console.nextFloat();
            while (part3 > 100 || part3 < 0) {
                System.out.println("Please input value 0.0 - 100.0 only.");
                part3 = console.nextFloat();
            }

            //Computation for the average of the Enabling Assessment grades
            float aveEnab = (enab1 + enab2 + enab3 + enab4) / 4;
            //Display to user the average of Enabling Assessments
            System.out.println("\nAverage of Enabling Assessments: " + Math.round(aveEnab * 100.0) / 100.0);    //Math.round is used for rounding off. In this case, *100.0/100.0 is used to round off to the nearest hundredths.

            //Computation for the average of the Summative Assessment grades
            float aveSum = ((sum1 + sum2) / 2);
            //Display to user the average of Summative Assessments
            System.out.println("Average of Summative Assessments: " + Math.round(aveSum * 100.0) / 100.0);

            //Computation for the average of the Class Participation grades
            float avePart = (part1 + part2 + part3) / 3;
            //Display to user the average of Class Participation
            System.out.println("Average of Class Participation: " + Math.round(avePart * 100.0) / 100.0);

            //Computation for Midterm Grade
            float midterm = (aveEnab * 0.5f) + (aveSum * 0.3f) + (avePart * 0.2f);
            System.out.println("\nMidterm Grade: " + Math.round(midterm * 100.0)/100.0);

            //Prompt user if he/she wants to retry the process
            System.out.print("\n\nEnter Y to retry the process: ");
            conf = console.next().charAt(0); //only stores the first letter of user input.
        } while (conf == 'Y'||conf == 'y');

        //Goodbye message when the user entered anything else than 'Y' or 'y'.
        System.out.println("Thank you for using the program. Please come back soon!");
    }
}
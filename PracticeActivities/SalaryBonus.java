//Salary bonus calculator
import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        //initiate variables
        Scanner console = new Scanner(System.in);
        int year;       //user input years of service
        int bonus = 0;  //bonus is initialized as 0, so we can change its value later accordingly
        float salary;   //user input base salary
        char conf;      //user input confirmation for retrying program

        do {
            //user input salary and years of service
            System.out.print("Please input Salary: ");
            salary = console.nextFloat();
            System.out.print("Please input years of service: ");
            year = console.nextInt();

            //code for the bonus received according to the years of service of the user
            if (year == 1) {
                salary = salary + (0.1f * salary);
                bonus = 10;
            } else if (year >= 2 && year <= 5) {
                salary = salary + (0.2f * salary);
                bonus = 20;
            } else if (year >= 6 && year <= 10) {
                salary = salary + (0.5f * salary);
                bonus = 50;
            } else if (year > 10) {
                salary = salary + (1 * salary);
                bonus = 100;
            }

            //displays updated income with their years of service and the bonus percentage they have received
            System.out.println("You have been in service for " + year + " years, and your corresponding bonus is: " + bonus + "%.\n" +
                    "This is your updated income with bonus: ₱" + Math.round(salary * 100.0) / 100.0);

            //prompt for retrying the program
            System.out.print("\nEnter Y to continue using the program: ");
            conf = console.next().charAt(0);
        } while (conf == 'y'||conf =='Y');

        //end message
        System.out.println("Thank you for using the program. Keep working hard!");
        System.exit(0);
    }
}

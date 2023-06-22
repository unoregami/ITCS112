import java.util.Scanner;

public class Esparas_ProgrammingAssessment1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1, num2, newNum;
        String name;
        double hoursWorked = 0;
        double wages;

        //receive input from user to num1 and num2
        System.out.println("Enter first number.");
            num1 = console.nextInt();
        System.out.println("Enter second number.");
            num2 = console.nextInt();
        System.out.println("The value of num1 is = " + num1 + "\nand the value of num2 is = " + num2);

        //declare to newNum this operation, (num1 *2) + num2. Then display output
        newNum = (num1 * 2) + num2;
        System.out.println("The value of newNum is = " + newNum);

        //updated value of newNum plus SECRET.
        newNum = newNum + SECRET;
        System.out.println("The value of newNum plus SECRET is = " + newNum);

        //user inputs last name for identification
        System.out.println("\nType your Last Name.");
            name = console.next();

        //code for user's input of hoursWorked from 0 to 70.
        //(optional) If number is lower than 0 and higher than 70. It will loop back to the first code before the while statement.
        while (hoursWorked <= 0 || hoursWorked > 70) {
            System.out.println("Enter a decimal number between 0 to 70.");
            hoursWorked = console.nextDouble();
                if (hoursWorked <= 0 || hoursWorked > 70){
                    System.out.println("The number you inputted is invalid.");
                }
        }

        //input the value to wages
        wages = RATE * hoursWorked;

        //display the input to the user.
        System.out.println("Name: " + name);
        System.out.println("Pay rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + wages);
    }
}
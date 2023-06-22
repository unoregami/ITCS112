//import needed classes
import java.util.Scanner;

public class FinalsLongQuiz_ESPARASPARCON {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);   //declare scanner
        int you;    //stores the value for menu.

        do {
            //menu selection
            System.out.println("[1] - Sum of Powers\n[2] - Series\n[3] - Mode\n[4] - Exit");
            System.out.print("Enter your choice: ");
            you = console.nextInt();
            System.out.println();
            while (you > 4) {
                System.out.println("Invalid input!");
                System.out.println("[1] - Sum of Powers\n[2] - Series\n[3] - Mode\n[4] - Exit");
                System.out.print("Enter your choice: ");
                you = console.nextInt();
                System.out.println();
            }

            if (you == 1) { //Sum of powers
                //Problem 1
                int sum = 0;
                //accept input from user
                System.out.print("Enter x: ");
                int x = console.nextInt();
                while (x < 0) {     //if value is not positive
                    System.out.print("Please input a non-negative number!: ");
                    x = console.nextInt();
                }
                System.out.print("Enter n: ");
                int n = console.nextInt();
                while (n < 0) {
                    System.out.print("Please input a non-negative number!: ");
                    n = console.nextInt();
                }

                //for loop formula for the problem 1
                for (int i = 1; i <= n; i++) {
                    double initial = Math.pow(x, i);
                    sum += initial;

                    if (i < n) {    //displays x and i with plus sign
                        System.out.print(x + "^" + i + " + ");
                    } else {        //displays x and i with equal sign as the last number.
                        System.out.print(x + "^" + i + " = ");
                    }
                }
                System.out.println(sum);    //displays sum to the user
                System.out.println();
            } else if (you == 2) {  //Series
                //Problem 2
                System.out.print("Enter n: ");  //accept input from user
                int n = console.nextInt();
                    int que = 0;

                //formula
                for (int i = 1; i <= n; i++) {
                    System.out.print("Enter a number: ");
                    int number = console.nextInt();

                    if (i == 1) {
                        que = number;
                    } else if (i % 2 == 0) {    //even number
                        que += number;
                    } else {                    //odd number
                        que -= number;
                    }
                }
                System.out.println(que);    //displays results to user
                System.out.println();
            } else if (you == 3) {  //Mode
                //Problem 3
                int freq = 1;
                int que = -2;
                int mode = 0;
                int number;

                do {
                    System.out.print("Enter a number: ");   //accepts number from user.
                    number = console.nextInt();

                    while (number < -1) {   //if number is negative, rejects value.
                        System.out.print("Please enter positive numbers only!: ");
                        number = console.nextInt();
                    }

                    if (number == que) {
                        freq ++;    //frequency counter

                    } else if (number >= 0) {       //resets frequency if number is not equal to que.
                        freq = 1;
                        mode = number;
                    }

                    que = number;
                } while (!(number == -1));  //while loop for the do-while, true until number is -1.

                System.out.println("The mode is " + mode + " and its frequency is " + freq);    //displays mode and freq
                System.out.println();
            }
        } while (!(you == 4));  //exit

        System.out.println("Thank you for using the program!\nMade with love by:\tAdolfo I G. Esparas and \n\t\t\t\t\tAlexander James Parcon"); //bye-bye message
        System.exit(0);
    }
}

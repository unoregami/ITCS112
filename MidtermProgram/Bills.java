//Bill separator
import java.util.Scanner;

public class Bills {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int money;
        int a1000 = 0;
        int b500 = 0;
        int c200 = 0;
        int d100 = 0;
        int e50 = 0;
        int f = 0;
        int g10 = 0;
        int h5 = 0;
        int j1 = 0;
        char des;
        char conf;

        do {
            System.out.print("Please enter sum of money: ");
            money = console.nextInt(); //4632
            System.out.print("Enter A for own solution and B for the correct solution: ");
            des = console.next().charAt(0);

            /* n1 reverts back to the rounded-off value
             * then it is used to be subtracted from money and divided by the corresponding denomination.
             *
             * ALSO THIS IS MY OWN SOLUTION FOR THE PROBLEM
             */
            if (des == 'a' || des == 'A') {
                a1000 = money / 1000;

                int a1 = a1000 * 1000;
                b500 = (money - a1) / 500;

                int b1 = b500 * 500;
                c200 = (money - (a1 + b1)) / 200;

                int c1 = c200 * 200;
                d100 = (money - (a1 + b1 + c1)) / 100;

                int d1 = d100 * 100;
                e50 = (money - (a1 + b1 + c1 + d1)) / 50;

                int e1 = e50 * 50;
                f = (money - (a1 + b1 + c1 + d1 + e1)) / 20;

                int f1 = f * 20;
                g10 = (money - (a1 + b1 + c1 + d1 + e1 + f1)) / 10;

                int g1 = g10 * 10;
                h5 = (money - (a1 + b1 + c1 + d1 + e1 + f1 + g1)) / 5;

                int h1 = h5 * 5;
                j1 = (money - (a1 + b1 + c1 + d1 + e1 + f1 + g1 + h1));

                /* This is the correct code using modulus for the problem.

                 * Formula:
                 * x = money / n | money = money % n
                 *
                 * where:
                 * n = the amount of bills to be separated from the money
                 * x = the variable where the value is stored
                 * money = the amount of money by user input
                 */
            } else if (des == 'b' || des == 'B') {
                a1000 = money / 1000;

                money = money % 1000;
                b500 = money / 500;

                money = money % 500;
                c200 = money / 200;

                money = money % 200;
                d100 = money / 100;

                money = money % 100;
                e50 = money / 50;

                money = money % 50;
                f = money / 20;

                money = money % 20;
                g10 = money / 10;

                money = money % 10;
                h5 = money / 5;

                money = money % 5;
                j1 = money;
            }

            //Display the output
            System.out.println("Denomination \tPieces");
            System.out.println("1000\t\t\t" + a1000);
            System.out.println("500\t\t\t\t" + b500);
            System.out.println("200\t\t\t\t" + c200);
            System.out.println("100\t\t\t\t" + d100);
            System.out.println("50\t\t\t\t" + e50);
            System.out.println("20\t\t\t\t" + f);
            System.out.println("10\t\t\t\t" + g10);
            System.out.println("5\t\t\t\t" + h5);
            System.out.println("1\t\t\t\t" + j1);

            //prompt for repeating the process
            System.out.println("\nEnter Y to repeat the process: ");
            conf = console.next().charAt(0);
        } while (conf == 'Y' || conf == 'y');

        System.out.println("Thank you for using the program.");
    }
}

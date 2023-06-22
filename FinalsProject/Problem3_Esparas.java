//Author: Adolfo I G. Esparas
import java.util.Scanner;

public class Problem3_Esparas {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //accepts input from user
        for (int i = 0; i < 5; i++) {
            System.out.print("Input number from 1 - 30: ");
            int n = console.nextInt();

            //if input is invalid
            while (n < 1 || n > 30) {
                System.out.println("INVALID INPUT!");
                System.out.print("Please input number from 1 - 30: ");
                n = console.nextInt();
            }

            //list the number
            System.out.print("Number " + n + ": ");

            //asterisk code
            for (int a = 0; a < n; a++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}

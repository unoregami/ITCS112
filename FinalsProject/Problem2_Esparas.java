//Author: Adolfo I G. Esparas
import java.util.Scanner;

public class Problem2_Esparas {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int pos = 0, neg = 0, zer = 0;

        System.out.print("Input how many numbers: ");
        int n = console.nextInt();

        //code for the separation of positive, negative, and zero numbers
        for (int i = 1; i <= n; i++) {
            System.out.print("Input number: ");
            int num = console.nextInt();

            if (num < 0) {  //negative
                neg++;
            } else if (num > 0) {   //positive
                pos++;
            } else {    //zero
                zer++;
            }
        }

        //displays results to user.
        System.out.println();
        System.out.println("Number of Positive numbers: " + pos);
        System.out.println("Number of Negative numbers: " + neg);
        System.out.println("Number of Zero numbers: " + zer);

        System.exit(0);
    }
}
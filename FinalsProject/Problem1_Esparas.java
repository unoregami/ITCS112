//Author: Adolfo I G. Esparas
import java.util.Scanner;

public class Problem1_Esparas {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int odd = 0, even = 0;

        System.out.print("Input how many number/s: ");
        int n = console.nextInt();

        //code for the separation of even and odd numbers and its sum.
        for (int i = 1; i <= n; i++) {
            System.out.print("Input number: ");
            int num = console.nextInt();

            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }

        //displays results to user.
        System.out.println();
        System.out.println("Sum for odd numbers: " + odd);
        System.out.println("Sum for even numbers: " + even);

        System.exit(0);
    }
}

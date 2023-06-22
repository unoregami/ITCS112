//Investment calculator
import java.util.Scanner;

public class DanProblem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double base;
        int years = 0;
        int input;
        char conf;

        do {
            System.out.print("Initial Investment: ");
            base = console.nextDouble();
            System.out.print("How many years? ");
            input = console.nextInt();
            do {
                years = years + 1;
                base = (base * 0.1) + base;
            }
            while (years != input);
            System.out.println(Math.round(base * 1000.0)/1000.0);

            System.out.println("\nEnter Y to repeat.");
            conf = console.next().charAt(0);
        }
        while ((conf == 'Y'||conf == 'y'));

        System.out.print("Thank you for using my program.");
    }
}

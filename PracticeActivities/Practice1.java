// Convert Fahrenheit to Celsius
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        float Fahrenheit;
        float Celsius;
        char conf;

        do {
            System.out.print("Please enter Fahrenheit: ");
            Fahrenheit = console.nextFloat();

            Celsius = ((Fahrenheit - 32) * (5 / 9f));
            System.out.println("Celsius: " + Celsius);

            System.out.println("Enter Y if you want to continue.");
            conf = console.next().charAt(0);
        }
        while (conf == 'y' || conf == 'Y'); //to repeat the statement everytime the user types Y/y.

        System.out.println("Goodbye!");
    }
}
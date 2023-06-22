//Applies 50% discount to the customer's amount due
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        float customer;
        float due;

        System.out.print("Please enter amount purchased: ");
        customer = console.nextFloat();

        due = customer * 0.5f;
        due = (float) (Math.round(due*100.0)/100.0); //Math.round used for rounding off to the nearest hundredths
        System.out.println("Amount due w/ 50% discount: " + due);
    }
}

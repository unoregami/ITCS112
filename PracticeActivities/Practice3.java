//Converts kilogram to pound
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        float kilo;
        float poun;

        System.out.print("Please input kilogram: ");
        kilo = console.nextFloat();

        poun = kilo * 2.20462262185f; //formula for kilo to pounds
        poun = (float) (Math.round(poun*100.0)/100.0); //Math.round is used for rounding off to the nearest hundredths
        System.out.println("The pounds for " + kilo + "kg is: " + poun + " lbs");
    }
}

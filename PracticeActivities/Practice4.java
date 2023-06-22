/* Finding the Diameter, Circumference, and Area of a Circle using the Radius.
 * all in Centimeters.
 */
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double radC;
        double d;
        double a;
        double c;


        System.out.print("Enter the radius of circle: ");
        radC = console.nextDouble();

        //formula for the diameter, circumference, area of the circle
        d = 2 * (radC);
        c = 2 * (Math.PI * radC); //Math.PI used for calling the PI (3.14 blahblah)
        a = Math.PI * (Math.pow(radC, 2));


        //round-off results to the nearest hundredths
        d = (double) (Math.round(d * 100.0)/100.0);
        c = (double) (Math.round(c * 100.0)/100.0);
        a = (double) (Math.round(a * 100.0)/100.0);

        System.out.println("\nRadius: " + radC + "cm" + "\nDiameter: " + d + "cm" + "\nCircumference: " + c + "cm" + "\nArea: " + a + "cm");
    }
}

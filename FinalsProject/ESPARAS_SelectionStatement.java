/* Adolfo I G. Esparas
 * ITCS112LA - Selection Statement */
import java.util.Scanner;

public class ESPARAS_SelectionStatement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);   //declare Scanner and variables
        char size, color, conf;

        do {
            do {
                conf = '0';     //for do while, conf = 0 to initialize

                System.out.print("What is the size: ");     //accepts input from user
                size = console.next().charAt(0);
                System.out.print("What is the color: ");
                color = console.next().charAt(0);

                if (size == 'S' || size == 's') {                               //shirt size is small
                    if (color == 'W' || color == 'w')
                        System.out.println("The price of the shirt is 180.00"); //price did not need DecimalFormat as it was given already in the instructions.
                    else if (color == 'C' || color == 'c')
                            System.out.println("The price of the shirt is 200.00");
                } else if (size == 'M' || size == 'm') {                        //shirt size is medium
                    if (color == 'W' || color == 'w')
                        System.out.println("The price of the shirt is 210.00");
                    else if (color == 'C' || color == 'c')
                        System.out.println("The price of the shirt is 230.00");
                } else if (size == 'L' || size == 'l') {                        //shirt size is large
                    if (color == 'W' || color == 'w')
                        System.out.println("The price of the shirt is 240.00");
                    else if (color == 'C' || color == 'c')
                        System.out.println("The price of the shirt is 260.00");
                } else {
                    System.out.println("The input is invalid. Please try again");   //if input is invalid, goes back from the start to retry.
                    conf = 'N';
                }
            } while (conf == 'N');

            System.out.print("Enter Y to continue using the program: ");    //prompts user if wants to continue using program.
            conf = console.next().charAt(0);
        } while (conf == 'y' || conf == 'Y');

        System.out.println("Thank you for using the program.");     //goodbye message and exit successfully.
        System.exit(0);
    }
}

/*Distance calculator
  Author: Adolfo I G. Esparas */

import javax.swing.JOptionPane; //import necessary packages to be used in the project
import java.text.DecimalFormat;

public class Esparas_MidAct1 {
    public static void main(String[] args) {
        DecimalFormat round = new DecimalFormat("#,##0.00");    //initialize the DecimalFormat
        //initialize variables to be used for the whole method.
        double d;
        double[] array = new double[4];     //array used to store coordinates' values instead of separate variables.
        int conf;
        int retry;

        do {        //first do-while for the repetition of the whole program at user confirmation at the end.
            do {    //second do-while is for when the inputted value is "wrong" according to the user confirmation.
                array[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input x1 coordinate:", "Distance Calculator: 1st Coordinates", JOptionPane.PLAIN_MESSAGE));     //user inputs the coordinates accordingly.
                array[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input y1 coordinate:", "Distance Calculator: 1st Coordinates", JOptionPane.PLAIN_MESSAGE));
                array[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input x2 coordinate:", "Distance Calculator: 2nd Coordinates", JOptionPane.PLAIN_MESSAGE));
                array[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input y2 coordinate:", "Distance Calculator: 2nd Coordinates", JOptionPane.PLAIN_MESSAGE));

                conf = JOptionPane.showConfirmDialog(null, "Are these coordinates correct?" + "\n(x1, y1) = " + "(" + round.format(array[0]) + ", " + round.format(array[1]) + ")" + "\n(x2, y2) = " + "(" + round.format(array[2]) + ", " + round.format(array[3]) + ")", "Input Confirmation", JOptionPane.YES_NO_OPTION);    //user confirmation if the inputted values are correct.
                if ( conf == 1) {   //if user chose "NO", executes this command block
                    JOptionPane.showMessageDialog(null, "Please Try Again.", "Distance Calculator", JOptionPane.ERROR_MESSAGE);
                }
            } while (conf == 1);    //go back to second do.

            //If user input chooses "YES", continue with the program.
                d = Math.sqrt(Math.pow((array[2] - array[0]), 2) + (Math.pow((array[3] - array[1]), 2)));   //formula for the distance.
                JOptionPane.showMessageDialog(null, "Distance between two points is: " + round.format(d), "Distance Calculator", JOptionPane.INFORMATION_MESSAGE);      //displays the result: distance.
            retry = JOptionPane.showConfirmDialog(null, "Do you want to continue using the program?", "Distance Calculator", JOptionPane.YES_NO_OPTION);        //confirmation from user if want to continue using the program.
        } while (retry == 0);

        //If user chooses "NO", display goodbye message and exits program.
        JOptionPane.showMessageDialog(null, "Thanks for using my program, hope to see you soon!", "Goodbye!", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

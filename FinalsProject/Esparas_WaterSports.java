import javax.swing.JOptionPane;
import javax.swing.JDialog;
import java.text.DecimalFormat;

public class Esparas_WaterSports {
    public static void main(String[] args) {
        DecimalFormat form = new DecimalFormat("₱#,##0.00");
        JDialog.setDefaultLookAndFeelDecorated(true);
        String[] array1 = {"Swimming", "Snorkeling", "Diving"};     //declare array for options of classes
        String[] array2 = {"Beginner", "Advanced"};                 //array for options of difficulty
        double fee = 0, extra = 0;
        int a, b = -1;
        boolean a0 = false, a1 = false, a2 = false;     //variables to determine if class is already selected or not. starting at false because no class is selected.


        //starting options
        a = JOptionPane.showOptionDialog(null, "Pick which class to enroll.", "Water Sports", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, array1, array1[0]);
        //a == 0, Swimming; a == 1, Snorkeling; a == 2, Diving.
        if (a >= 0) {
            b = JOptionPane.showOptionDialog(null, "Pick Skill Level.", "Water Sports", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, array2, array2[0]);
            if (b < 0) {      //if exit on diff prompt
                JOptionPane.showMessageDialog(null, "Invalid Input. Please Try Again.", "Water Sports", JOptionPane.WARNING_MESSAGE);
                System.exit(1);
            }
        }
        else {    //if exit on class prompt
            JOptionPane.showMessageDialog(null, "Invalid Input. Please Try Again.", "Water Sports", JOptionPane.WARNING_MESSAGE);
            System.exit(1);
        }

        //computation for the fee and extra
        if (a == 0) {
            fee += 5000;
            a0 = true;
        } else if (a == 1) {
            fee += 2500;
            a1 = true;
        } else if (a == 2) {
            fee += 8000;
            a2 = true;
        }
        if (b == 0) {
            extra += 1000;
        } else if (b == 1) {
            extra += (-500);
        }

        String[] array3 = {"Swimming", "Snorkeling", "Diving", "Continue to total."};       //created another array options with additional option for proceeding to total fee.

        //loop class
        while (!(a == 3)) {     //execute command block until "Continue to total" is selected.
            a = -1;
            b = -1;
            boolean aPrompt = false;

            while (!aPrompt) {      //keeps the user in class prompt picked class is already chosen before
                a = JOptionPane.showOptionDialog(null, "Pick which class to enroll.", "Water Sports", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, array3, array3[0]);

                if (a == 0 && a0) {
                    JOptionPane.showMessageDialog(null, "You have chosen this class already!", "Water Sports", JOptionPane.WARNING_MESSAGE);
                } else if (a == 1 && a1) {
                    JOptionPane.showMessageDialog(null, "You have chosen this class already!", "Water Sports", JOptionPane.WARNING_MESSAGE);
                } else if (a == 2 && a2) {
                    JOptionPane.showMessageDialog(null, "You have chosen this class already!", "Water Sports", JOptionPane.WARNING_MESSAGE);
                } else {
                    aPrompt = true;     //aPrompt turns true if chosen class is not chosen before.
                }
            }

            if (a >= 0 && a < 3) {
                b = JOptionPane.showOptionDialog(null, "Pick Skill Level.", "Water Sports", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, array2, array2[0]);
                if (b < 0) {      //if exit on diff prompt
                    JOptionPane.showMessageDialog(null, "Invalid Input. Please Try Again.", "Water Sports", JOptionPane.WARNING_MESSAGE);
                    System.exit(1);
                }
            }
            else if (a < 0) {    //if exit on class prompt
                JOptionPane.showMessageDialog(null, "Invalid Input. Please Try Again.", "Water Sports", JOptionPane.WARNING_MESSAGE);
                System.exit(1);
            }

            if (a == 0) {
                fee += 5000;
                a0 = true;
            } else if (a == 1) {
                fee += 2500;
                a1 = true;
            } else if (a == 2) {
                fee += 8000;
                a2 = true;
            }
            if (b == 0) {
                extra += 1000;
            } else if (b == 1) {
                extra += (-500);
            }

        }

        //total fee with discounts/charges
        fee = fee + extra;

        //displays results to user on a Dialog Box
        if (a0 && a1 && a2) {
            JOptionPane.showMessageDialog(null, "Water Sport/s class: Swimming, Snorkeling, Diving" + "\nCharge/Discount: " + form.format(extra) + "\nTotal Tuition Fee: " + form.format(fee), "Water Sports", JOptionPane.INFORMATION_MESSAGE);
        } else if (a0 && a1) {
            JOptionPane.showMessageDialog(null, "Water Sport/s class: Swimming, Snorkeling" + "\nCharge/Discount: " + form.format(extra) + "\nTotal Tuition Fee: " + form.format(fee), "Water Sports", JOptionPane.INFORMATION_MESSAGE);
        } else if (a0 && a2) {
            JOptionPane.showMessageDialog(null, "Water Sport/s class: Swimming, Diving" + "\nCharge/Discount: " + form.format(extra) + "\nTotal Tuition Fee: " + form.format(fee), "Water Sports", JOptionPane.INFORMATION_MESSAGE);
        } else if (a1 && a2) {
            JOptionPane.showMessageDialog(null, "Water Sport/s class: Snorkeling, Diving" + "\nCharge/Discount: " + form.format(extra) + "\nTotal Tuition Fee: " + form.format(fee), "Water Sports", JOptionPane.INFORMATION_MESSAGE);
        } else if (a0) {
            JOptionPane.showMessageDialog(null, "Water Sport/s class: Swimming" + "\nCharge/Discount: " + form.format(extra) + "\nTotal Tuition Fee: " + form.format(fee), "Water Sports", JOptionPane.INFORMATION_MESSAGE);
        } else if (a1) {
            JOptionPane.showMessageDialog(null, "Water Sport/s class: Snorkeling" + "\nCharge/Discount: " + form.format(extra) + "\nTotal Tuition Fee: " + form.format(fee), "Water Sports", JOptionPane.INFORMATION_MESSAGE);
        } else if (a2) {
            JOptionPane.showMessageDialog(null, "Water Sport/s class: Diving" + "\nCharge/Discount: " + form.format(extra) + "\nTotal Tuition Fee: " + form.format(fee), "Water Sports", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
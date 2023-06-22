//Pos, Neg, and Zero identifier
import java.util.Scanner;

public class FlowchartEnabling {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int count = 0;
        int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        char conf;

        do {
            System.out.println("Welcome! This is a program used to determine how many Positive, Negative, and Zero Numbers" +
                    " you have inputted.");
            System.out.print("Please input 10 numbers: ");
            a1 = console.nextInt();
            a2 = console.nextInt();
            a3 = console.nextInt();
            a4 = console.nextInt();
            a5 = console.nextInt();
            a6 = console.nextInt();
            a7 = console.nextInt();
            a8 = console.nextInt();
            a9 = console.nextInt();
            a10 = console.nextInt();

            do {
                //a1
                if (a1 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a1 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
                //a2
                if (a2 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a2 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
                //a3
                if (a3 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a3 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
                //a4
                if (a4 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a4 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
                //a5
                if (a5 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a5 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
                //a6
                if (a6 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a6 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
                //a7
                if (a7 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a7 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
                //a8
                if (a8 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a8 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
                //a9
                if (a9 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a9 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
                //a10
                if (a10 > 0) {
                    pos = pos + 1;
                    count = count + 1;
                } else if (a10 < 0) {
                    neg = neg + 1;
                    count = count + 1;
                } else {
                    zero = zero + 1;
                    count = count + 1;
                }
            }
            while (count != 10);
            //Prints out the value for the succeeding integers
            System.out.println("There are: \n" + pos + " Positive Integers,\n" + neg + " Negative Integers, and\n"
                    + zero + " Zero Integers.");
            //prompt for retrying the program
            System.out.println("\nEnter Y to try again.");
            conf = console.next().charAt(0);
        }
        while ((conf == 'Y')||(conf == 'y'));

        System.out.println("Thank you for using my program :)");
    }
}

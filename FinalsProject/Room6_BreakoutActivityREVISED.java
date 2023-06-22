import java.util.Scanner;

public class Room6_BreakoutActivityREVISED {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year;
        String month;

            System.out.print("Enter month: ");
            month = console.next().toLowerCase();
            System.out.print("Enter year: ");
            year = console.nextInt();

        /* January, March, May, July, August, October, December = 31
           April, June, September, November = 30
           February = 28 */

            //if year is not leap year
            int a = year % 4;
            int b = year % 400;
            int c = year % 100;

            switch (month) {
                case "january":
                case "march":
                case "may":
                case "july":
                case "august":
                case "october":
                case "december":
                    System.out.println("Number of days are 31.");
                    break;
                case "april":
                case "june":
                case "september":
                case "november":
                    System.out.println("Number of days are 30");
                    break;
                case "february":
                    if (b == 0 || a == 0 && c !=0)
                        System.out.println("Number of days are 29");
                    else if (a > 0 || b > 0 || c == 0)
                        System.out.println("Number of days are 28");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
            }

            System.out.println();
            System.out.println("Adolfo I G. Esparas \nLuis Miguel Vida \nAleianna Clarisse C. Contreras");
            System.out.println();
        System.exit(0);
    }
}

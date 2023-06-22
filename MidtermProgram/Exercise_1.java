import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner conc = new Scanner(System.in);
        double gross;
        double salary;
        char proc;

        do {
            System.out.println("Enter week gross sales.");
            gross = conc.nextDouble();

            salary = gross * 0.20 + 500;
            System.out.println("This is your salary\n" + salary);

            System.out.println("\nType Y if you wish to continue.");
            proc = conc.next().charAt(0);
        }
        while ((proc == 'y')||(proc == 'Y'));

        System.exit(0);
    }
}

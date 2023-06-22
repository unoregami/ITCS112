import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input;
        int a, b, c, d, e, f;

        do {
            System.out.print("Enter a 6-digit number: ");
            input = console.nextInt();
        }
        while (input > 999999 || input < 100000);
        a = input / 100000;
        b = (input / 10000) % 10;
        c = (input / 1000) % 10;
        d = (input / 100) % 10;
        e = (input / 10) % 10;
        f = input % 10;

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
    }
}

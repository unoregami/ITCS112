public class MathPow {
    public static void main(String[] args) {
        //Math.pow()) example
        float due = 3f;
        float a = (float) (Math.pow(due, 2));
        System.out.println(a); //returns value of 9 since 3^2 is = 9

        //you can also use this inline
        float b = 2 + 3 * (float) (Math.pow(due, 3)) - 36;
        System.out.println(b); //returns value of 47 cause why not, solve it yourself to see.
    }
}

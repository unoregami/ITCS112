import java.util.*;
class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter array size: ");
            int n = input.nextInt();

            int[] array = new int[n];

            System.out.println("Enter " + n + " elements:"); // <-- changed
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }

            int max_min[] = getMax_MinValue(array); // <- notice this.

            System.out.println("Max Value: " + max_min[0]);
            System.out.println("Min Value: " + max_min[1]);

        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT >> PLEASE INPUT A NUMBER");
        } finally {
            input.close(); // close the scanner
        }
    }

    // return type changed
    private static int[] getMax_MinValue(int[] array) {

        int maxValue = array[0];
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }

        }

        int min_max[] = {maxValue, minValue}; // min_max[0] has max value and min_max[1] has min value
        return min_max;
    }
}
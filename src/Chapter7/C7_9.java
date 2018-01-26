package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program calculates the smallest number in an array
 *
 * @author Leo Matveev
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x = 0;
        double m;
        double[] array;
        array = new double[10];
        System.out.print("Enter 10 numbers: ");
        while (10 > x) {
            array[x] = i.nextDouble();
            x++;
        }
        m = min(array);
        System.out.print("Smallest number: " + m);
    }

    public static double min(double[] array) {
        Arrays.sort(array);
        return array[0];
    }

}

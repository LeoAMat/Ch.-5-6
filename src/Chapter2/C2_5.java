package Chapter2;

import java.util.Scanner;

/**
 * Program calculates a cost of a meal with a tip
 *
 * @author Leo Matveev
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s, g;
        System.out.println("Enter the subtotal: $");
        s = input.nextDouble();
        System.out.println("Enter the gratuity rate: %");
        g = input.nextDouble();
        System.out.println("A subtotal of $" + s + " with a gratuity of $" + g * s / 100 + " leaves a total of $" + (s + g * s * .01));
    }

}

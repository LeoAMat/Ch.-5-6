package Chapter2;

import java.util.Scanner;

/**
 * Program converts Celsius to Fahrenheit
 *
 * @author Leo Matveev
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c;
        double f;
        System.out.println("Enter the temperature in Celsius: ");
        c = input.nextDouble();
        f = 1.8 * c + 32;
        System.out.println(c + " degrees Celsiu(s) is equal to " + f + " degree(s) Fahrenheit");
    }

}

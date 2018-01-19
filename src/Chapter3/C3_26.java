package Chapter3;

import java.util.Scanner;

/**
 * Program checks if a number is divisible by 5 and 6
 *
 * @author Leo Matveev
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);;
        System.out.print("Input an integer: ");
        i = input.nextInt();
        System.out.print("Is " + i + " divisible by 5 and 6? ");
        System.out.println(i % 5 == 0 && i % 6 == 0);
        System.out.print("Is " + i + " divisible by 5 or 6? ");
        System.out.println(i % 5 == 0 || i % 6 == 0);
        System.out.print("Is " + i + " divisible by 5 or 6, but not both? ");
        System.out.println(i % 5 == 0 && i % 6 != 0 || i % 5 != 0 && i % 6 == 0);
    }

}

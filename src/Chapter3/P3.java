package Chapter3;

import java.util.Scanner;

/**
 * Program compares two numbers in various ways
 *
 * @author Leo Matveev
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double a, b;
        System.out.println("Input the first number: ");
        a = i.nextDouble();
        System.out.println("Input the second number: ");
        b = i.nextDouble();
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else if ((a / b) < 1) {
            System.out.println("Proper fraction.");
        } else {
            System.out.println("Improper fraction.");
        }
        if (b >= a) {
            System.out.println("The first number is less than or equal to the second.");
            if (b > a) {
                System.out.println("The first number is not equal to the second.");
                System.out.println("The first number is less than the second.");
            } else {
                System.out.println("The first number is equal to the second.");
            }
        } else {
            System.out.println("The first number is greater than the second.");
            System.out.println("The first number is not equal to the second.");
        }
        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (b >= 1 && b <= 100) {
            System.out.println("In range.");
        } else {
            System.out.println("Out of range.");
        }
    }

}

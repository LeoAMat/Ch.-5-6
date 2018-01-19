package Chapter3;

import java.util.Scanner;

/**
 * Program calculates which package is the better deal when given two weights
 * and prices
 *
 * @author Leo Matveev
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double fa, pa, fb, pb;
        System.out.println("Input weight of package one: ");
        fa = i.nextDouble();
        System.out.println("Input price of package one: ");
        pa = i.nextDouble();
        System.out.println("Input weight of package two: ");
        fb = i.nextDouble();
        System.out.println("Input price of package two: ");
        pb = i.nextDouble();
        fa = pa / fa;
        fb = pb / fb;
        if (fa >= fb) {
            if (fa > fb) {
                System.out.println("Package two has a better value.");
            } else {
                System.out.println("The packages have equal value.");
            }
        } else {
            System.out.println("Package one has a better value.");
        }
    }
}

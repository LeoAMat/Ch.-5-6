package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program checks is two arrays are strictly identical
 *
 * @author Leo Matveev
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x = 1, s;
        int[] a1, a2;
        System.out.print("Enter first array: ");
        s = i.nextInt() + 1;
        a1 = new int[s];
        a1[0] = s;
        while (s > x) {
            a1[x] = i.nextInt();
            x++;
        }
        x = 1;
        System.out.print("Enter second array: ");
        s = i.nextInt() + 1;
        a2 = new int[s];
        a2[0] = s;
        while (s > x) {
            a2[x] = i.nextInt();
            x++;
        }
        if (equals(a1, a2)) {
            System.out.print("Lists strictly identical");
        } else {
            System.out.print("Lists not strictly identical");
        }
    }

    /**
     * Method checks if two arrays are identical
     *
     * @param a1 the first array inputed by user
     * @param a2 the second array inputed by user
     * @return true/false boolean, determines in arrays are identical
     */
    public static boolean equals(int[] a1, int[] a2) {
        return Arrays.equals(a1, a2);
    }

}

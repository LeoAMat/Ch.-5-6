package Chapter7;

import java.util.Scanner;

/**
 * Program calculates array average
 *
 * @author Leo Matveev
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int s;
        int[] a1;
        System.out.print("Enter array lenght: ");
        s = i.nextInt();
        a1 = new int[s];
        input(a1, i);
        System.out.println("Enter array average: " + avg(a1));
        print(a1);
    }

    public static void input(int[] a1, Scanner i) {
        int x = 0;
        System.out.print("Enter array : ");
        while (a1.length > x) {
            a1[x] = i.nextInt();
            x++;
        }
    }

    public static double avg(int[] a1) {
        int x = 0;
        double t = 0;
        while (a1.length > x) {
            t = t + a1[x];
            x++;
        }
        return t / (a1.length);
    }

    public static void print(int[] a1) {
        int x = 0;
        System.out.print("Array : ");
        while (a1.length > x) {
            System.out.print(a1[x] + " ");
            x++;
        }
    }

}

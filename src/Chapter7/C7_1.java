package Chapter7;

import java.util.Scanner;

/**
 * Program calculates student grade and score
 *
 * @author Leo Matveev
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int s, x, m;
        x = 0;
        int[] t;
        String[] g;
        System.out.print("Enter student count: ");
        s = i.nextInt();
        t = new int[s];
        g = new String[s];
        System.out.print("Enter " + s + " scores: ");
        m = 0;
        while (s > x) {
            t[x] = i.nextInt();
            if (t[x] > m) {
                m = t[x];
            }
            x++;
        }
        x = 0;
        while (s > x) {
            if (t[x] >= (m - 10)) {
                g[x] = "A";
            } else if (t[x] >= (m - 20)) {
                g[x] = "B";
            } else if (t[x] >= (m - 30)) {
                g[x] = "C";
            } else if (t[x] >= (m - 40)) {
                g[x] = "D";
            } else {
                g[x] = "F";
            }
            System.out.println("Student " + x + "'s score is: " + t[x] + " and grade is:" + g[x]);
            x++;
        }
    }

}

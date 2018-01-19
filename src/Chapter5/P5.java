package Chapter5;

import java.util.Scanner;

/**
 * Program counts and displays vote data
 *
 * @author Leo Matveev
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String u;
        int y, n, e, t;
        y = 0;
        n = 0;
        e = 0;
        t = 0;
        System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
        u = i.next().toUpperCase();
        while (!u.equals("Q")) {
            t++;
            if (u.equals("Y")) {
                y++;
            } else if (u.equals("N")) {
                n++;
            } else {
                System.out.print("INVALID CODE: ");
                e++;
            }
            System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
            u = i.next().toUpperCase();
        }
        System.out.println("Yes votes: " + y);
        System.out.println("No votes: " + n);
        System.out.println("Invalid votes: " + e);
        System.out.println("Total votes: " + t);
    }

}

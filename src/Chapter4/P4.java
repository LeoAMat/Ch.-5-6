package Chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Program decides which bidder wins
 *
 * @author Leo Matveev
 */
public class P4 {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String n1, n2;
        double p1, p2, t1, t2;
        int h1, h2;
        System.out.print("First Bidder enter name: ");
        n1 = i.next();
        System.out.print("First Bidder enter hours required: ");
        h1 = i.nextInt();
        System.out.print("First Bidder hourly pay rate: $");
        p1 = i.nextDouble();
        t1 = Math.round(h1 * p1 * 100.00) / 100.00;
        System.out.print("Second Bidder enter name: ");
        n2 = i.next();
        System.out.print("Second Bidder enter hours required: ");
        h2 = i.nextInt();
        System.out.print("Second Bidder hourly pay rate: $");
        p2 = i.nextDouble();
        t2 = Math.round(h2 * p2 * 100.00) / 100;
        if (t1 < t2) {
            System.out.println(n1 + " Wins!");
            System.out.println("Total cost: $" + df2.format(t1));
        } else if (t2 < t1) {
            System.out.println(n2 + " Wins!");
            System.out.println("Total cost: $" + df2.format(t2));
        } else {
            if (h1 < h2) {
                System.out.println(n1 + " Wins!");
                System.out.println("Total cost: $" + df2.format(t1));
                System.out.println("Total hours: " + h1);
            } else if (h2 < h1) {
                System.out.println(n2 + " Wins!");
                System.out.println("Total cost: $" + df2.format(t2));
                System.out.println("Total hours: " + h2);
            } else {
                System.out.println(n1 + " and " + n2 + " have identical bids!");
                System.out.println(n1 + "'s total cost: $" + df2.format(t1) + "\t" + n2 + "'s total cost: $" + df2.format(t2));
                System.out.println(n1 + "'s total hours: " + h1 + "\t" + n2 + "'s total hours: " + h2);
                System.out.println(n1 + "'s cost per hour: " + p1 + "\t" + n2 + "'s cost per hour: " + p2);
            }
        }
    }

}

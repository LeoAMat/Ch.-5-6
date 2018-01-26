package Chapter8;

import java.util.Scanner;

/**
 * Program calculates sales per week
 *
 * @author Leo Matveev
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int r = 0, x = 0;
        double v = 0;
        String s = "", d = "", u = "";
        double[][] sales = {{0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}};
        while (!u.equals("N")) {
            u = "";
            while (!s.equals("A") && !s.equals("B") && !s.equals("C") && !s.equals("D")) {
                System.out.println("Enter the salesman ID as A, B, C, or D: ");
                s = i.next().toUpperCase();
                if (!s.equals("A") && !s.equals("B") && !s.equals("C") && !s.equals("D")) {
                    System.out.println("Invalid Input: ");
                }
            }
            while (!d.equals("M") && !d.equals("T") && !d.equals("W") && !d.equals("H") && !d.equals("F")) {
                System.out.println("Enter the day as M, T, W, H, or F: ");
                d = i.next().toUpperCase();
                if (!d.equals("M") && !d.equals("T") && !d.equals("W") && !d.equals("H") && !d.equals("F")) {
                    System.out.println("Invalid Input: ");
                }
            }
            System.out.println("Enter the amount of the sale for " + s + " on " + d + ":  ");
            v = i.nextDouble();
            if (s.equals("A")) {
                r = 0;
            } else if (s.equals("B")) {
                r = 1;
            } else if (s.equals("C")) {
                r = 2;
            } else {
                r = 3;
            }
            if (d.equals("M")) {
                x = 0;
            } else if (d.equals("T")) {
                x = 1;
            } else if (d.equals("W")) {
                x = 2;
            } else if (d.equals("H")) {
                x = 3;
            } else {
                x = 4;
            }
            if (sales[r][x] > 0) {
                sales[r][x] = sales[r][x] + v;
            } else {
                sales[r][x] = v;
            }
            while (!u.equals("Y") && !u.equals("N")) {
                System.out.println("More data? Enter Y for more or N to stop: ");
                u = i.next().toUpperCase();
                if (!u.equals("Y") && !u.equals("N")) {
                    System.out.println("Invalid Input: ");
                }
            }
            d = "";
            s = "";
        }
        System.out.println("Salesman\tM\tT\tW\tH\tF");
        System.out.print("A\t");
        r = 0;
        while (x < 5) {
            System.out.print("\t" + sales[r][x]);
            x++;
        }
        System.out.println("");
        x = 0;
        System.out.print("B\t");
        r = 1;
        while (x < 5) {
            System.out.print("\t" + sales[r][x]);
            x++;
        }
        System.out.println("");
        x = 0;
        System.out.print("C\t");
        r = 2;
        while (x < 5) {
            System.out.print("\t" + sales[r][x]);
            x++;
        }
        System.out.println("");
        x = 0;
        System.out.print("D\t");
        r = 3;
        while (x < 5) {
            System.out.print("\t" + sales[r][x]);
            x++;
        }
    }

}

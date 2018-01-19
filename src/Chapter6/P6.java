package Chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Program converts currency
 *
 * @author Leo Matveev
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double e, p, y, d;
        String u = "";
        System.out.print("Enter $ to € conversion rate: ");
        e = i.nextDouble();
        System.out.print("Enter $ to £ conversion rate: ");
        p = i.nextDouble();
        System.out.print("Enter $ to ¥ conversion rate: ");
        y = i.nextDouble();
        while (!u.equals("NO")) {
            System.out.print("Enter $ amount: $");
            d = i.nextInt();
            System.out.print("Enter “E” to buy €, “P” to buy £, or “Y” to buy ¥: ");
            u = i.next().toUpperCase();
            u = convCalc(u, e, p, y, d);
        }
    }

    public static String convCalc(String u, double e, double p, double y, double d) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner i = new Scanner(System.in);
        double a;
        if (u.equals("E")) {
            if (d <= 100) {
                a = d * e * .9;
            } else {
                a = d * e * .95;
            }
            System.out.println("$" + d + " is equal to €" + df.format(a) + ".");
        }
        if (u.equals("P")) {
            if (d <= 100) {
                a = d * p * .9;
            } else {
                a = d * p * .95;
            }
            System.out.println("$" + d + " is equal to £" + df.format(a) + ".");
        }
        if (u.equals("Y")) {
            if (d <= 100) {
                a = d * y * .9;
            } else {
                a = d * y * .95;
            }
            System.out.println("$" + d + " is equal to ¥" + df.format(a) + ".");
        }
        System.out.println("Are there more conversions to perform?(Y/N): ");
        u = i.next().toUpperCase();
        while (!u.equals("YES") && !u.equals("NO")) {
            System.out.println("Enter \"yes\" to continue or \"no\" to stop: ");
            u = i.next().toUpperCase();
        }
        return u;
    }
}

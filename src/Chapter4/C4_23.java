package Chapter4;

import java.util.Scanner;

/**
 * Program calculates a workers pay after taxes
 *
 * @author Leo Matveev
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String e;
        double h, p, f, s, n;
        System.out.println("Employee: ");
        e = i.next();
        System.out.println("Hours Worked in a Week: ");
        h = i.nextDouble();
        System.out.println("Pay Rate:");
        p = i.nextDouble();
        System.out.println("Federal Tax: ");
        f = i.nextDouble();
        System.out.println("State Tax: ");
        s = i.nextDouble();
        n = p * h - ((f * p * h) + (s * p * h));
        System.out.println("Employee: " + e);
        System.out.println("Hours Worked: " + h);
        System.out.println("Pay Rate:" + p);
        System.out.println("Gross Pay :" + (p * h));
        System.out.println("Deductions: ");
        System.out.println("\t Federal Withholding: " + (f * p * h));
        System.out.println("\t State Withholding: " + Math.round((s * p * h) * 100.0) / 100.0);
        System.out.println("\t Total Deduction: " + (Math.round((f * p * h) + (s * p * h) * 100.0) / 100.0));
        System.out.println("Net Pay: " + (Math.round(n * 100.0) / 100.0));
    }

}

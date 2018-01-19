package Chapter2;

import java.util.Scanner;

/**
 * Program calculates a cylinders area
 *
 * @author Leo Matveev
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double r, l, a;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the cylinder radius: ");
        r = input.nextDouble();
        System.out.println("Input the cylinder length: ");
        l = input.nextDouble();
        a = r * r * 3.1415;
        System.out.print("A cylinder with a radius of " + r + " and a lenght of" + l + " has an area of " + a + " and a volume of " + a * l + ".");
    }

}

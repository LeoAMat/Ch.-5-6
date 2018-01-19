package Chapter2;

import java.util.Scanner;

/**
 * Program calculate the total cost of a meal with tax
 *
 * @author Leo Matveev
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double f, ta, ti, to;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the price of your meal: $");
        f = input.nextDouble();
        System.out.println("Input the price of your drink: $");
        f = f + input.nextDouble();
        System.out.println("Input the price of your dessert: $");
        f = f + input.nextDouble();
        ta = f * .10;
        ti = (f + ta) * .15;
        to = f + ti + ta;
        System.out.println("The total for a meal costing $" + f + " with a sales tax of $" + ta + " and a tip of $" + ti + " equals $" + to + ".");
    }

}

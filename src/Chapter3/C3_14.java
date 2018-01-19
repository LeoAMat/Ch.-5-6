package Chapter3;

import java.util.Scanner;

/**
 * Program asks for a guess of the outcome of a coin flip, then posts results
 *
 * @author Leo Matveev
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int r = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess, heads(1) or tails(0): ");
        if (input.nextDouble() == r) {
            System.out.println("You are correct!");
        } else {
            System.out.println("You are incorrect, better luck next time!");
        }
    }
}

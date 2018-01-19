package Chapter5;

import java.util.Scanner;

/**
 * Program plays Rock, Paper, Scissors versus the player
 *
 * @author Leo Matveev
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String u;
        int c, v, cv;
        cv = 0;
        v = 0;
        System.out.print("Input R for rock, P for paper, S for scissors: ");
        //0 = R, 1 = P, 2 = S
        while (v - cv != 2 && cv - v != 2) {
            System.out.print("Input R for rock, P for paper, S for scissors: ");
            u = i.next().toUpperCase();
            c = (int) Math.floor(Math.random() * 3);
            System.out.println(u + " " + c);
            if (u.equals("R")) {
                if (c == 0) {
                    System.out.println("Tie!");
                }
                if (c == 1) {
                    cv++;
                    System.out.println("You lose!");
                }
                if (c == 2) {
                    v++;
                    System.out.println("You win!");
                }
            } else if (u.equals("P")) {
                if (c == 0) {
                    v++;
                    System.out.println("You win!");
                }
                if (c == 1) {
                    System.out.println("Tie!");
                }
                if (c == 2) {
                    cv++;
                    System.out.println("You lose!");
                }
            } else if (u.equals("S")) {
                if (c == 0) {
                    cv++;
                    System.out.println("You lose!");
                }
                if (c == 1) {
                    v++;
                    System.out.println("You win!");
                }
                if (c == 2) {
                    System.out.println("Tie!");
                }
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("Computer: " + cv);
            System.out.println("You: " + v);
            c = (int) Math.floor(Math.random() * 3);
        }
    }
}

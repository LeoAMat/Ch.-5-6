package Chapter4;

import java.util.Scanner;

/**
 * Program displays a college students title and major
 *
 * @author Leo Matveev
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String m;
        int y;
        System.out.print("Enter two characters: ");
        m = i.next().toUpperCase();
        y = Integer.parseInt(m.substring(1));
        m = m.substring(0, 1);
        if (y == 1 || y == 2 || y == 3 || y == 4) {
            if (m.equals("M")) {
                System.out.print("Mathematics ");
            } else if (m.equals("C")) {
                System.out.print("Computer Science ");
            } else if (m.equals("I")) {
                System.out.print("Information Technology ");
            } else {
                y = 5;
            }
            if (y == 1) {
                System.out.println("Freshman");
            } else if (y == 2) {
                System.out.println("Sophmore");
            } else if (y == 3) {
                System.out.println("Junior");
            } else if (y == 4) {
                System.out.println("Senior");
            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }

}

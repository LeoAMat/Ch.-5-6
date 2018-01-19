package Chapter5;

import java.util.Scanner;

/**
 * Program reverses inputed string
 *
 * @author Leo Matveev
 */
public class C5_47 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String u;
        System.out.print("Input string: ");
        u = i.nextLine();
        System.out.print("Reversed string: " + (new StringBuffer(u).reverse().toString()));
    }
}

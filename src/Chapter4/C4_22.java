package Chapter4;

import java.util.Scanner;

/**
 * Program checks if one string in a sub string of another
 *
 * @author Leo Matveev
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String s, ss;
        System.out.println("Input a string: ");
        s = i.next();
        System.out.println("Input a substring: ");
        ss = i.next();
        if (s.contains(ss)) {
            System.out.println(ss + " is a substring of " + s);
        } else {
            System.out.println(ss + " is not a substring of " + s);
        }
    }

}

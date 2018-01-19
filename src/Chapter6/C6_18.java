package Chapter6;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Program checks if password meets requirements
 *
 * @author Leo Matveev
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String u;
        System.out.println("Password requirements: ");
        System.out.println("\tEight characters");
        System.out.println("\tOnly letters and numbers");
        System.out.println("\tAt least two digits");
        System.out.print("Enter password: ");
        u = i.next();
        if (passCheck(u)) {
            System.out.print("Invalid Password");
        } else {
            System.out.print("Valid Password");
        }
    }

    public static Boolean passCheck(String u) {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        int v = 0;
        if (u.length() < 8) {
            System.out.println("You need " + (8 - u.length()) + " more character(s)!");
            v++;
        }
        if ((u.replaceAll("\\D", "").length()) < 2) {
            System.out.println("You are lacking " + (2 - (u.replaceAll("\\D", "").length())) + " digit(s)!");
            v++;
        }
        if (p.matcher(u).find()) {
            System.out.println("Contains invalid character(s)!");
            v++;
        }
        return (v > 0);
    }

}

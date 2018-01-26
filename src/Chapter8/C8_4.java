package Chapter8;

/**
 * Program calculates employee hours
 *
 * @author Leo Matveev
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int t = 0, x = 0, r = 0;
        final int[][] hours = {{2, 4, 3, 4, 5, 8, 8},
        {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2},
        {9, 3, 4, 7, 3, 4, 1},
        {3, 5, 4, 3, 6, 3, 8},
        {3, 4, 4, 6, 3, 4, 4},
        {3, 7, 4, 8, 3, 8, 4},
        {6, 3, 5, 9, 2, 7, 9}};
        System.out.println("        \tSu\tT\tM\tW\tTh\tF\tSa\tTotal");
        int[] total = new int[8];
        while (r < 8) {
            System.out.print("Employee " + r);
            while (x < 7) {
                System.out.print("\t" + hours[r][x]);
                t = t + hours[r][x];
                x++;
            }
            System.out.println("\t" + t);
            total[r] = t;
            t = 0;
            x = 0;
            r++;
        }
        r = total[2];
        while (r > 0) {
            while (x < total.length) {
                if (total[x] >= r) {
                    r = total[x];
                    t = x;
                }
                x++;
            }
            System.out.println("Employee" + (t) + " hours: " + r);
            total[t] = 0;
            r = total[2];
            x = 0;
        }
    }

}

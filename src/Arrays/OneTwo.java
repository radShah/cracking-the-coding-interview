package Arrays;

/**
 * Created by radha on 9/18/16.
 */

import java.util.Arrays;

public class OneTwo {



    public boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    public static void main(String [] args) {
        OneTwo solver = new OneTwo();
        System.out.println(solver.isPermutation("hello", "radha"));
    }
}

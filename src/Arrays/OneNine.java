package Arrays;

/**
 * Created by radha on 10/2/16.
 */
public class OneNine {

    public boolean isRotated(String s1, String s2) {
        /* s1 = waterbottle = xy
        * s2 = erbottlewat = yx
        * yxyx = erbottlewaterbottlewat
        * xy is substring of yxyx
        */

        if (s1.length() == s2.length() && (s1.length() != 0)) {
            return (isSubstring(s1, s2+s2));
        }
        return false;
    }

    public boolean isSubstring(String s1, String s2) {
        return true;
    }


}

package Arrays;

/**
 * Created by radha on 11/5/16.
 */
public class OneFive {
    public boolean isOneEdit(String s1, String s2) {
        switch (Math.abs(s1.length() - s2.length())) {
            case 0:
                isOneEditReplace(s1, s2);
            case 1:
                if (s1.length() > s2.length()) {
                    isOneEditInsert(s1, s2);
                } else {
                    isOneEditInsert(s2, s1);
                }
            default:
                return false;
        }
    }


    public boolean isOneEditReplace(String s1, String s2) {
        boolean diffFound = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diffFound) {
                    return false;
                } else {
                    diffFound = true;
                }
            }
        }
        return true;
    }

    public boolean isOneEditInsert(String s1, String s2) {
        boolean diffFound = false;
        int index2 = 0;
        for (int index1 = 0; index1 < s1.length(); index1++) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (diffFound) {
                    return false;
                } else {
                    index2++;
                    diffFound = true;
                }
            } else {
                index1--;
                index2++;
            }
        }
        return true;
    }

    public boolean isOneEdit_Condensed(String word1, String word2) {
        if (Math.abs(word1.length() - word2.length()) > 1) { return false; };
        // pases, lases
        String s1 = null;
        String s2 = null;
        if (word1.length() > word2.length()) {
            String temp = word1;
            s1 = word2;
            s2 = temp;
        } else {
            s1 = word1;
            s2 = word2;
        }
        boolean diffFound = false;
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (diffFound) {
                    return false;
                } else {
                    diffFound = true;
                    if (s1.length() != s2.length()) {
                        index2++;
                    } else {
                        index1++;
                        index2++;
                    }
                }
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }




    public static void main(String [] args) {
        OneFive solver = new OneFive();
        System.out.println(solver.isOneEdit_Condensed("pale", "pales"));
        System.out.println(solver.isOneEdit_Condensed("pale", "psale"));
        System.out.println(solver.isOneEdit_Condensed("pale", "bale"));
        System.out.println(solver.isOneEdit_Condensed("pale", "ple"));
    }
}

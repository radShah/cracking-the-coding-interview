package Arrays;

import java.util.HashSet;

/**
 * Created by radha on 9/18/16.
 */
public class OneOne {

    public static boolean isUnique(String word) {
        char [] chars = word.toCharArray();
        /* HashSet extends Abstract Set, which implements the Set interface. It is a HashTable in which all values are the same.
         * Definition of Set disallows duplicate values. **/
        HashSet mappedChars = new HashSet();
        for (int i = 0; i < chars.length; i++) {
            if (!mappedChars.add(chars[i])) {
                return false;
            }
        }
        System.out.println(mappedChars);
        return true;
    }

    public boolean hasUniqueChar(String s) {
        boolean [] charHit = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int asciiVal = (int) s.charAt(i);
            if (charHit[asciiVal] == false){
                charHit[asciiVal] = true;
            }
            else {
                return false;
            }
        }
        return true;
    }



    public static boolean isUniqueNoDataStructures(String word) {
        if (word.length() > 128) {
            return false;
        }
        char asciiChars [] = new char[128];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = (int) c;
            if (((int) asciiChars[index]) == 0 ) {
                asciiChars[index] = c;
            } else {
                System.out.println(c + " is a duplicate character");
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
//        System.out.println(OneOne.isUnique("Hither"));
        System.out.println(OneOne.isUniqueNoDataStructures("Hitherr"));
    }
}

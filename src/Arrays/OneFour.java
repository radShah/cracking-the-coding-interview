package Arrays;
import java.util.HashMap;
import java.util.stream.Collector;

/**
 * Created by radha on 9/18/16.
 */

public class OneFour {
    final int aValue = Character.getNumericValue('a');
    final int zValue = Character.getNumericValue('z');

    public boolean isPermutationPalindrome(String word) {
        HashMap<Character, Integer> chars = createMap(word);

        if (word.length() % 2 == 0) {
            for (Integer val : chars.values()) {
                if (val  % 2 != 0) {
                    System.out.println(chars);
                    return false;
                }
            }
        } else {
            boolean oddFound = false;
            for (Integer val : chars.values()) {
                if (val  % 2 != 0 && oddFound) {
                    System.out.println(chars);
                    return false;
                } else {
                    oddFound = true;
                }
            }
        }

        System.out.println(chars);
        return true;
    }

    private HashMap<Character, Integer> createMap(String word) {
        HashMap<Character, Integer> chars = new HashMap<> ();
        for (int i = 0; i < word.length(); i++) {
            char key = word.charAt(i);
            if (key == ' ')
                continue;
            if (chars.get(key) != null) {
                chars.put(key, chars.get(key) + 1);
            } else {
                chars.put(key, 1);
            }
        }
        return chars;
    }

    public boolean isPermutationPalindrome_BitVersion(String phrase) {
        int bitVector = createBitVector(phrase);
        return bitVector == 0 || checkIfOnlyOneBitSet(bitVector);
    }

    public int createBitVector(String phrase) {
        int bitVector = 0;
        for (char c : phrase.toCharArray()) {
            int val = getCharNumber(c);
            bitVector = toggle(bitVector, val);
        }
        return bitVector;
    }

    public int toggle(int bitVector, int index) {
        if (index < 0) return bitVector;
        int mask = 1 << index;
        if ((bitVector & mask) == 0) {
            bitVector |= mask;
        } else {
            bitVector &= mask;
        }
        return bitVector;
    }

    public boolean checkIfOnlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector -1)) == 0;
    }

    public int getCharNumber(char c) {
        int cValue = Character.getNumericValue(c);
        if (cValue >= aValue && cValue <= zValue) {
            return cValue - aValue;
        } else {
            return -1;
        }

    }


    public static void main(String [] args) {
        OneFour solver = new OneFour();
        boolean result = solver.isPermutationPalindrome_BitVersion("taco ocat");
        System.out.println(result);

    }
}

package Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.CharacterData;

/**
 * Created by radha on 11/6/16.
 */
public class OneSix {

    public String compressString(String str) {
        if (str.length() == 0 || str == null) return str;
        StringBuilder compressed = new StringBuilder();
        int consecutiveCount = 0;
        for (int i = 0; i < str.length(); i++) {
            consecutiveCount++;
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressed.append(Character.toString(str.charAt(i)) + consecutiveCount);
                consecutiveCount=0;
            }

        }
        return compressed.toString().length() < str.length() ? compressed.toString() : str;
    }


    @Test
    public void test_aaabbbccccddd() {
        OneSix solver = new OneSix();
        String compressed = solver.compressString("aaabbbcccddd");
        Assert.assertEquals("a3b3c3d3", compressed);
    }
}

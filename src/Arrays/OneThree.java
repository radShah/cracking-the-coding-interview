package Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by radha on 9/18/16.
 */
public class OneThree {

    public String urlify(char [] chars, int trueLength) {
        int endPointer = chars.length;
        for (int i = trueLength - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                chars[endPointer-1] = chars[i];
                endPointer--;
            } else {
                chars[endPointer-1] = '0';
                chars[endPointer-2] = '2';
                chars[endPointer-3] = '%';
                endPointer = endPointer - 3;
            }
        }
        return new String(chars);
    }

    @Test
    public void test_urlify() {
        OneThree solver = new OneThree();
        String original = "Ms. Radha Shah is the bomb          ";

        Assert.assertEquals("Ms.%20Radha%20Shah%20is%20the%20bomb", urlify(original.toCharArray(), 26));
    }
}

package LinkedLists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.CharacterCodingException;
import java.util.Stack;

/**
 * Created by radha on 9/29/16.
 */
public class TwoSix {

    class LinkedListNode {
        String data;
        LinkedListNode next;

        LinkedListNode(String data) {
            this.data = data;
        }
    }


    public boolean isPalindrome(LinkedListNode head) {

        String word = "";
        LinkedListNode current = head;
        while (current != null) {
            word += current.data;
            current = current.next;
        }
        int front = 0;
        int back = word.length() -1;
        char [] chars = word.toCharArray();
        while (front <= back) { //"helleh"
            if (chars[front] != chars[back]) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }






    LinkedListNode head;
    @Before
    public void before() {
        head = new LinkedListNode("h");
        head.next = new LinkedListNode("e");
        head.next.next = new LinkedListNode("l");
        head.next.next.next = new LinkedListNode("l");
        head.next.next.next.next = new LinkedListNode("e");
        head.next.next.next.next.next = new LinkedListNode("h");
    }

    @Test
    public void test_isPalindrome_false() {
        head.next.next.next.next.next.next = new LinkedListNode("s");
        Assert.assertFalse(isPalindrome(head));
    }

    @Test
    public void test_isPalindrome_true() {
        Assert.assertTrue(isPalindrome(head));
    }
}





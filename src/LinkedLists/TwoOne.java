package LinkedLists;

import java.util.HashSet;

/**
 * Created by radha on 9/24/16.
 */
public class TwoOne {

   /*
    * Efficiency:
    * O(n) - iterate over n nodes in the linked list.
    */

    public LinkedListNode deleteDups(LinkedListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode current = head;
        LinkedListNode prev = null;
        while (current != null) {
            if (set.contains(current.data)) {
                prev.next = current.next;
            } else {
                set.add(current.data);
                prev = current;
            }
            current = current.next;

        }
        return head;
    }
}

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

    public LinkedListNode deleteDupsNoBuffer(LinkedListNode head) {
        LinkedListNode current =  head;
        while (current != null) {
            LinkedListNode runner = head;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String [] args) {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode one = new LinkedListNode(3);
        LinkedListNode two = new LinkedListNode(1);
        LinkedListNode three = new LinkedListNode(5);
        LinkedListNode four = new LinkedListNode(3);
        head.next = one;
        one.next = two;
        two.next = three;
        three.next = four;
        LinkedList.printLinkedList(head);
        TwoOne solver = new TwoOne();
        solver.deleteDups(head);
        LinkedList.printLinkedList(head);

    }
}


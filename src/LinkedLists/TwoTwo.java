package LinkedLists;

import sun.awt.image.ImageWatched;

/**
 * Created by radha on 9/24/16.
 */
public class TwoTwo {

    /* Reverse list and iterate k forward
     * O(n^2)
     */
    public int findKthLastNode1(LinkedList linkedList, int k) {
        LinkedList reverseList = new LinkedList();
        while (linkedList.getLast() != null) {
            reverseList.add(linkedList.getLast());
            linkedList.removeLast();
        }
        System.out.println("Reversed list:");
        LinkedList.printLinkedList(reverseList.getHead());
        LinkedListNode current = reverseList.getHead();
        for (int i = 1; i < k; i++) {
            current = current.next;
        }
        return current.data;
    }

    /*
     * Calculate length of list.
     * Iterate (length - k) forward.
     * Worst = O(n^2)
     * Best = O(n)
     * Medium = O(n) + O(n - k)
     */
    public int findKthLastNode2(LinkedList linkedList, int k) {
        LinkedListNode current = linkedList.getHead();
        int length = 0;
        while (current != null) {
            length++;
            current = current.getNext();
        }
        if (k > length) return -1;
        current = linkedList.getHead();
        for (int i = 1; i <=(length - k); i++) {
            current = current.next;
        }
        return current.data;
    }

    /*
     * 2 pointers, p1  at head p2 at k.
     * When p2 as end, p1 at (length - k)
     * O(n)
     */

    public int findKthLastNode3(LinkedList linkedList, int k) {
        LinkedListNode runner1 = linkedList.getHead();
        LinkedListNode runner2 = linkedList.getHead();
        for (int i = 1; i < k; i++) {
            runner2 = runner2.next;
        }
        while (runner2.getNext() != null) {
            runner1 = runner1.next;
            runner2 = runner2.next;
        }
        return runner1.data;
    }


    public static void main(String [] args) {
        LinkedList list = LinkedList.getAList();
        System.out.println("Original list:");
        LinkedList.printLinkedList(list.getHead());
        TwoTwo solver = new TwoTwo();
//        int answer = solver.findKthLastNode1(list, 2);    // should print 5
//        System.out.println("Answer: " + answer);
        int k = 3;
        int answer2 = solver.findKthLastNode2(list, k);    // should print 5
        System.out.println(k + "th element to last is " + answer2);
        int answer3 = solver.findKthLastNode2(list, k);    // should print 5
        System.out.println(k + "th element to last is " + answer3);





    }
}

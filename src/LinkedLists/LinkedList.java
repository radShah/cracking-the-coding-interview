package LinkedLists;

import sun.awt.image.ImageWatched;

/**
 * Created by radha on 9/24/16.
 */
public class LinkedList {

    private LinkedListNode head;

    private LinkedListNode last;

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    public LinkedListNode getLast() {
        return last;
    }

    public void setLast(LinkedListNode last) {
        this.last = last;
    }

    public void add(LinkedListNode newNode) {
        if (this.head == null) {
            this.head = this.last = newNode;
        } else {
            last.next = newNode;
            last = last.next;
        }
    }

    public void removeLast() {
        if (this.last == null) return;
        if (this.head.next == this.head) {
            this.last = this.head;
            return;
        }
        if (this.head == this.last) {
            this.head = this.last = null;
            return;
        }
        LinkedListNode current = this.getHead();
        while (current.next.next != null) {
            current = current.next;
        }
        last = current;
        last.next = null;
    }


    public static void printLinkedList(LinkedListNode head) {
        while (head.next != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print(head.data);
        System.out.println();

    }


    public static LinkedList getAList() {
        LinkedList list = new LinkedList();
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode one = new LinkedListNode(3);
        LinkedListNode two = new LinkedListNode(1);
        LinkedListNode three = new LinkedListNode(5);
        LinkedListNode four = new LinkedListNode(3);
        list.add(head);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        return list;
    }
}


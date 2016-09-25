package LinkedLists;

/**
 * Created by radha on 9/24/16.
 */
public class TwoThree {
    public boolean removeNode(LinkedListNode node) {
        if (node == null) return false;
        if (node.next == null) { // last node in list can't be deleted, give it a dummy value.
            node.data = Integer.MIN_VALUE;
            return true;
        }
        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
        return true;
    }
}

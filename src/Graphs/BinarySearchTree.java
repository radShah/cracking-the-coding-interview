package Graphs;

/**
 * Created by radha on 10/16/16.
 */
public class BinarySearchTree {

    BSTNode root;

    public boolean insert(int n) {
        if (root == null) { root = new BSTNode(n); }
        BSTNode current = root;
        if (current.data == n) {
            return false;
        } else if (current.data > n) {

        }

        return false;



    }

    public boolean delete(int n) {
        return false;
    }

    public BSTNode find (int n) {
        BSTNode current = root;
        while (current != null) {
            if (current.data == n) {
                return current;
            }
            else if (n > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return null;
    }

    public Node getRandomNode(BSTNode node) {
        return null;

    }


}

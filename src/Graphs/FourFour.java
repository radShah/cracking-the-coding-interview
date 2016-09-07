package Graphs;


/**
 * Created by radha on 9/7/16.
 */

public class FourFour {
    /** Time: 33 min
     * Runtime: O(n)
     */
    public boolean checkBalanced(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null) return true;
        else if (left != null && right == null & (left.left != null || left.right != null)) return false;
        else if (left == null && right != null || (right.left != null || right.right != null)) return false;
        return checkBalanced(left) && checkBalanced(right);
    }

    /** Official solution **/
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    public int checkHeight(TreeNode root) {
        if (root == null) return -1;
        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heightDifference = leftHeight - rightHeight;
        if (heightDifference > 1) {
            return Integer.MIN_VALUE;
        } else {
            return  Math.max(leftHeight, rightHeight) + 1;
        }

    }



    public static void main (String [] args) {
        TreeNode tree = GraphTraversals.createIntegerGraph();
        FourFour solver = new FourFour();
        System.out.println(solver.checkBalanced(tree)); //true
        TreeNode displaceNode = tree.getLeft().getLeft();
        tree.getLeft().setLeft(null);
        tree.getLeft().getRight().setRight(displaceNode);
        System.out.println(solver.checkBalanced(tree)); //false
    }



}

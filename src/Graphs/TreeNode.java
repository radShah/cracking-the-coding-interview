package Graphs;

/** Average case run-time for search -> O(logn)
 *  In a BST, for every node, the left sub-tree must contain nodes less than, 
 *  and the right sub-tree must contain nodes greater then.
 *  
 *  In-order traversal produces a sorted list.
 */

public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}

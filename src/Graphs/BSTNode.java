package Graphs;

/** Average case run-time for search -> O(logn)
 *  In a BST, for every node, the left sub-tree must contain nodes less than, 
 *  and the right sub-tree must contain nodes greater then.
 *  
 *  In-order traversal produces a sorted list.
 */

public class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public void insert(BSTNode newNode) {
		
	}
	
	public boolean findNodeIteratively(BSTNode root, int searchData) {
		if (root == null) return false;
		BSTNode currentNode = root;
		while (currentNode != null) {
			if (currentNode.data == searchData) {
				return true;
			} else if (searchData < root.data) {
				currentNode = currentNode.left;
			} else {
				currentNode = currentNode.right;
			}
		}
		return false;
	}
	
	public boolean findNodeRecursively(BSTNode root, int searchData) {
		if (root == null) { return false; }
		if (root.data == searchData)  { return true; }
		if (root.data > searchData ) {
			findNodeRecursively(root.left, searchData);
		} else {
			findNodeRecursively(root.right, searchData);
		}
		return false;
	}
	
	public BSTNode findMinNodeIteratively(BSTNode root) {
		if (root == null) return null;
		BSTNode min = root;
		while (min.getLeft() != null) {
			root.left = min;
		}
		return min;
	}
	
	public BSTNode findMinNodeRecursively(BSTNode root) {
		if (root == null) return null;
		BSTNode min = root;
		if (root.getLeft() == null) {
			return root;
		} else {
			return findMinNodeRecursively(root.left);
		}
	}
	
	public BSTNode findMaxNodeIteratively(BSTNode root) {
		if (root == null) return null;
		BSTNode max = root;
		while (max.getRight() != null) {
			root.right = max;
		}
		return max;
	}
	
	public BSTNode findMaxNodeRecursively(BSTNode root) {
		if (root == null) return null;
		BSTNode max = root;
		if (root.getRight() == null) {
			return root;
		} else {
			return findMaxNodeRecursively(root.right);
		}
	}
	
	public static void main (String args[]) {
		BSTNode root = new BSTNode(10);
		root.left = new BSTNode(6);
		root.left.left = new BSTNode(4);
		root.left.right = new BSTNode(8);
		root.right = new BSTNode(15);
		root.right.left = new BSTNode(12);
		root.right.right = new BSTNode(17);
	}
	
}

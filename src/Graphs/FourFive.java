package Graphs;

import java.util.ArrayList;
import java.util.Collections;

public class FourFive {
	
	ArrayList<Integer> inOrderNodes = new ArrayList<Integer>();
	
	/** confusion about recusion
	 * when will it return to the recursive stack, and when will it return out to the user?
	 * This is wrong! 
	 * This will return true for:
	 *                  34
	 *                /	  \
	 *              23	   67
	 *            	/\
	 *            12  37
	 */
	
	public boolean checkIfBST1(BSTNode root) {
		if (root == null) return false;
		BSTNode left = root.getLeft();
		BSTNode right = root.getRight();
		if (left == null && right == null) {
			return true;
		} else if (left != null && left.getData() < root.getData() && right == null) {
			checkIfBST1(left);
		} else if (right != null && right.getData() > root.getData() && left == null) {
			checkIfBST1(right);
		} else if (left.getData() < root.getData() &&
				right.getData() > root.getRight().getData()) {
			checkIfBST1(left);
			checkIfBST1(right);
		} else {
			return false;
		}
		return true;
	}
	
	public boolean checkIfBST2(TreeNode root) {
		return checkIfBST2(root, null, null);
	}
	
	public boolean checkIfBST2(TreeNode root, Integer min, Integer max) {
		if (root == null) return true;
		// check if the node is out of range.
		if ((min != null && root.getData() <= min) || (max != null && root.getData() >= max)) {
			return false;
		}
		// Using recursion within condition
		if (!checkIfBST2(root.getLeft(), min, new Integer(root.getData())) || !checkIfBST2(root.getRight(), new Integer(root.getData()), max)) {
			return false;
		}
		return true;
	}
	
	public boolean checkIfBST3(TreeNode root) {
		inOrderNodes.clear();
		inOrderTraversal(root);
		for (int i = 0; i < inOrderNodes.size() - 1; i++) {
			if (inOrderNodes.get(i) > inOrderNodes.get(i+1)) {
				return false;
			}
		}
		return true;
		
	}
	
	public void inOrderTraversal(TreeNode root) {
		if (root == null) return;
		inOrderTraversal(root.getLeft());
		inOrderNodes.add(root.getData());
		inOrderTraversal(root.getRight());
	}
	
	public static void main (String args[]) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(6);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(11);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(17);
		FourFive solver = new FourFive();
		boolean isBST = solver.checkIfBST3(root);
		if (isBST) {
			System.out.println("YASSSSS");
		} else {
			System.out.println("NAAAAAA");
		}
		
		
	}
}

package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;


public class FourThree {
	
	public ArrayList<LinkedList<BSTNode>> createListOfDepths(BSTNode root) {
		if (root == null) return null;
		ArrayList<LinkedList<BSTNode>> listOfDepths = new ArrayList<LinkedList<BSTNode>>();
		ArrayList<BSTNode> nodesAtCurrentDepth = new ArrayList<BSTNode>();
		ArrayList<BSTNode> nodesAtNextDepth = null;
		nodesAtCurrentDepth.add(root);
		while (nodesAtCurrentDepth.size() != 0) {
			// create LinkedList at current depth
			LinkedList<BSTNode> newList = null;
			for (int i = 0; i < nodesAtCurrentDepth.size(); i++) {
				newList = new LinkedList<BSTNode>();
				newList.add(nodesAtCurrentDepth.get(i));
			}
			nodesAtNextDepth = new ArrayList<BSTNode>();
			for (int i = 0; i < nodesAtCurrentDepth.size(); i++) {
				BSTNode left = nodesAtCurrentDepth.get(i).getLeft();
				BSTNode right = nodesAtCurrentDepth.get(i).getRight();
				if (left != null) nodesAtNextDepth.add(left);
				if (right != null) nodesAtNextDepth.add(right);
			}
			nodesAtCurrentDepth = nodesAtNextDepth;
			listOfDepths.add(newList);
			printList(newList);
		}
		return listOfDepths;
	}
	
	void printList(LinkedList<BSTNode> newList) {
		String list = "";
		for (BSTNode node : newList ) {
			list += Integer.toString(node.getData()) + " ";
		}
		System.out.println(list);
	}
	
	public static void main (String args[]) {
		BSTNode root = new BSTNode(10);
		root.left = new BSTNode(6);
		root.left.left = new BSTNode(4);
		root.left.right = new BSTNode(8);
		root.right = new BSTNode(15);
		root.right.left = new BSTNode(12);
		root.right.right = new BSTNode(17);
		FourThree solver = new FourThree();	
		solver.createListOfDepths(root);
	}
	
	

}

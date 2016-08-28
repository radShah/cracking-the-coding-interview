package Graphs;
/**
 * 
 * @author radha
 * 
 * In DFS, we exhaust a branch a node's neighbor, before visiting the next neighbor.
 *
 */

public class DFS {
	
	public void search (Node root) {	
		if (root == null) return;
		visit(root);
		root.visited= true;
		for (Node neighbor : root.adjacent) {
			if (!neighbor.visited)
				search(neighbor);
		}
		
	}
	
	public void visit(Node vNode) {
		System.out.println(vNode.data);
	}

}

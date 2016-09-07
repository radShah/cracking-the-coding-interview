package Graphs;

public class GraphTraversals {
	
	static Node root;
	
	public static void main (String[] args) {
		root = createGraph();	
		DFS dfs = new DFS();
		BFS bfs = new BFS();
		
		System.out.println("Results of DFS search:\n-----------------------------\n");
		dfs.search(root);
		
		System.out.println("\n\nResults of BFS search:\n-----------------------------\n");
		bfs.search(root);
	}
	
	public static Node createGraph() {
		Node node1 = new Node("Hello.");
		Node node2 = new Node("It's");
		Node node3 = new Node("me");
		
		node1.add(node2);
		node1.add(node3);
		node2.add(new Node("I was wondering if after all these years, "));
		node2.add(new Node("you'd like to meet."));
		node3.add(new Node("To go over,"));
		node3.add(new Node("everything."));
		
		return node1;
	}

	public static TreeNode createIntegerGraph() {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(6);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(11);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(17);
		return root;
	}

}

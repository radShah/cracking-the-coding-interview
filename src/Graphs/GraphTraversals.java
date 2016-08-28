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

}

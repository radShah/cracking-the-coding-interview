package Graphs;
import java.util.ArrayList;

public class Node {
	
	String data;
	ArrayList<Node> adjacent;
	boolean visited; // for simple implementations
	State state;	// for complex state implementations
	
	public Node(String data) {
		this.data = data;
		adjacent = new ArrayList<Node>();
	}
	
	public void add(Node node) {
		this.adjacent.add(node);
	}
	
	public void printNeighbors() {
		String neighborString = "";
		for (Node neighbor : this.adjacent) {
			neighborString += " " + neighbor.data + " ";
		}
		System.out.println(neighborString);
	}
}


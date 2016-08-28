package Graphs;
/**
 * In BFS, we exhaust a node's neighbors, before examining a neighbor's edges.
 * 
 */

import java.util.LinkedList;
import java.util.Queue;


public class BFS {
	
	public void search (Node node) {
		
		/*
		 * 1. Loop over all children of the current.
		 * 2. Put each child in a queue.
		 * 3. Dequeue the queue.
		 * Do this until queue is empty
		 */
		
		String traversal = "";
		Queue<Node> queue = new LinkedList<Node>();
		if (node != null) {
			queue.add(node);
			traversal = node.data + "\n";
		}
		else 
			System.out.println("Empty graph.");
		
		while (!queue.isEmpty()) {
			Node current = queue.remove();
			for (Node neighbor : current.adjacent) {
				neighbor.visited = true;
				traversal += (neighbor.data + "\n");
				queue.add(neighbor);
			}
		}
		System.out.println(traversal);
	}

}

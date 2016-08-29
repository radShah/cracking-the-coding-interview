package Graphs;

import java.util.Queue;
import java.util.LinkedList;

public class FourOne {
		
	/*
	 * Question:
	 * 4.1 - Find if there is a path between 2 notes in a directed graph.
	 * 
	 * Solution:
	 * Can use BFS or DFS.
	 * Whether it's cyclic or acyclic, if there is no path, there will be a point where there are
	 * no more unvisited adjacent nodes to visit.
	 * In a undirected graph, there is ALWAYS a path between two nodes.
	 * 
	 */
	
	/*
	 * Differences between solutions:
	 * 	1) Passing in graph. This is needed to initialize all nodes to the unvisited state.
	 *  2) Use of enum State. This is needed to for the use of "Visiting", having visited a node,
	 *  	but not iterated through all it's neighbors.
	 */
	
	/*
	 * Trade-offs between BFS vs DFS:
	 *  BFS is good for finding the shortest path, at the lowest level. 
	 *  DFS can go errant, by searching the wrong branch very deeply.
	 *  DFS is more simple to implement - simple recursion.
	 */
	
	public boolean findPathThroughBFS(Graph graph, Node origin, Node destination) {
		if (origin == null || destination == null) return false;
		if (origin == destination) return true;
		for (Node node : graph.getNodes()) {
			node.state = State.Unvisited;
		}
		Queue<Node> queue = new LinkedList<Node>(); // This differs from CCI, which declares LinkedList, in order to use removeFirst.
		origin.state = State.Visiting;
		queue.add(origin);
		while (!queue.isEmpty()) {
			Node current = queue.remove();
			for (Node adjacent : current.adjacent) {
				if (adjacent.state == State.Unvisited) {
					if (adjacent == destination) { // assumes that we are given the destination node, not copy of it.
						return true;
					} else {
						adjacent.state = State.Visiting;
						queue.add(adjacent);
					}
				}
			}
			current.state = State.Visited;
		}
		return false;
	}
		
	public boolean findPathThroughDfsStart(Graph graph, Node origin, Node destination) {
		if (origin == null || destination == null) return false;
		if (origin == destination) return true;
		for (Node node : graph.getNodes()) {
			node.visited = false;
		}
		origin.visited = true;
		findPathThroughDFS(origin, destination);
		return false;
	}
	
	public boolean findPathThroughDFS(Node origin, Node destination) {
		for (Node adjacent : origin.adjacent) {
			if (!adjacent.visited) {
				if (adjacent == destination) {
					return true;
				} else {
					adjacent.visited = true;
					findPathThroughDFS(adjacent, destination);
				}

			}
		}
		return false;
		
	}


}

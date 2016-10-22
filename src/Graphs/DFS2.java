package Graphs;

/**
 * Created by radha on 10/12/16.
 */
public class DFS2 {

    public class DFSNode {
        Object data;
        DFSNode [] neighbors;
        boolean visited;
    }

    public void search(DFSNode node) {
        if (node == null) {
            return;
        }
        node.visited = true;
        for (DFSNode neighbor : node.neighbors) {
            if (!neighbor.visited)
                search(neighbor);
        }
    }
}


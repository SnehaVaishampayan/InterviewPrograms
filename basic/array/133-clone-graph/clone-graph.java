/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) {
            return null;
        }
        Map<Node, Node> visitedNodesMap = new HashMap<>();
        dfs_clonegraph(node, visitedNodesMap);
        return visitedNodesMap.get(node);
    }

    public void dfs_clonegraph( Node currNode , Map<Node, Node> visitedNodesMap) {

        // Clone the node 
        Node new_node = new Node(currNode.val);
        visitedNodesMap.put(currNode, new_node);

        // visited recursively its neighbors and assign to new_node
        for(Node eachNeighbor: currNode.neighbors) {
            if(!visitedNodesMap.containsKey(eachNeighbor)) {    // Already not cloned
                dfs_clonegraph(eachNeighbor, visitedNodesMap);
            }
            // get already cloned eachNeighbor's oldNodeOfEachNeighbor
            Node oldNodeOfEachNeighbor = visitedNodesMap.get(eachNeighbor);

            // Add oldNodeOfEachNeighbor to new_Node's neighbor
            new_node.neighbors.add(oldNodeOfEachNeighbor);
        }

    }
}
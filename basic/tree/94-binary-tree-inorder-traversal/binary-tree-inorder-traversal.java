/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // get the stack..  // left process right        
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) {
            return result;
        }
        TreeNode currNode = root;
        boolean done = false;
        while(!done) {
            // put all left in stack
            if(currNode != null) {
                st.push(currNode);
                currNode = currNode.left;
            }
            else {
                if(st.isEmpty()) {
                    done = true;
                }
                else {
                    // Process 
                    currNode = st.pop();
                    result.add(currNode.val);
                    // Move right                
                    currNode = currNode.right;                    
                }
            }
        }
        return result;
    }
}
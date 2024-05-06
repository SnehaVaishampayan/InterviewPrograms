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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        // Process node -> put right in stack -> put left in stack
        if(root == null) {
            return result;
        }
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode currNode = st.pop();
            if(currNode != null) {
                // Process
                result.add(currNode.val);

                if(currNode.right != null) {
                    st.push(currNode.right);
                }
                if(currNode.left != null) {
                    st.push(currNode.left);
                }
            }
        }
        return result;
    }
}
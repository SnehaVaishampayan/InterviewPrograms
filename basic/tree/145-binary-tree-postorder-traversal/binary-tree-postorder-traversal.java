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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) {
            return result;
        }
        TreeNode prevNode = null;
        st.push(root);

        while(!st.isEmpty()) {
            TreeNode currNode = st.peek();
            if(prevNode == null || prevNode.left == currNode || prevNode.right == currNode ) {
                if(currNode.left != null) {
                    st.push(currNode.left);
                }
                else if(currNode.right != null) {
                    st.push(currNode.right);
                }                
            } 
            else if(currNode.left == prevNode) {
                    if(currNode.right != null) {
                        st.push(currNode.right);
                    }
                }
            else {
                // process currNode  
                result.add(currNode.val);
                st.pop();
            }
            prevNode = currNode;
        }
        return result;
    }
}
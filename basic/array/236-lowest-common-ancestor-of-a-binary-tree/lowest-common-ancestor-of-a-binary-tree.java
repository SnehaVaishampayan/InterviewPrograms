/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode currNode, TreeNode p, TreeNode q) {
        // dfs at each node
        //      return if null OR currNode == p OR currNode == q 

        // at the end .. if leftReturn not null and rightReturn not null
        //         return currNode.. 
        //  else non null value 

        if(currNode == null || currNode == p || currNode == q)  {
            return currNode;
        }
        
        TreeNode leftReturn = lowestCommonAncestor(currNode.left, p, q);
        TreeNode rightReturn = lowestCommonAncestor(currNode.right, p, q);

        if(leftReturn != null && rightReturn != null) {
            return currNode;
        }
        return leftReturn == null ? rightReturn : leftReturn;
    }
}
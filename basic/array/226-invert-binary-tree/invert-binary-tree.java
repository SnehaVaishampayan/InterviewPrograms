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
    public TreeNode invertTree(TreeNode root) {
        if(root == null ) 
            return root;

        else {
            invertTreeNoReturn(root); // returns void
        }
        return root;
    }
    public void invertTreeNoReturn(TreeNode node) {
        if(node == null) 
            return;

        // Swap nodes
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        // recurse
        invertTreeNoReturn(node.left) ;
        invertTree(node.right);
    }
}
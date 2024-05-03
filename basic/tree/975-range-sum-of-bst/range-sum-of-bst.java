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
    public int rangeSumBST(TreeNode root, int low, int high) {        
        return levelorder( root,  low,  high);
    }
    int levelorder(TreeNode root, int low, int high) {
        int result = 0;
        Queue<TreeNode> next_level_q = new LinkedList<>();
        if(root == null) {
            return result;
        }
        next_level_q.offer(root);
        
        while(!next_level_q.isEmpty()) {
            TreeNode currNode = next_level_q.poll();
            if(currNode.val >= low && currNode.val <= high) {
                result += currNode.val;
            }
            if(currNode.left != null) {
                next_level_q.offer(currNode.left);
            if(currNode.right != null) 
                next_level_q.offer(currNode.right);
            }
        }
        return result;


    }
}
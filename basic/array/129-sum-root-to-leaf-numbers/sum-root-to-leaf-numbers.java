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

    public int sumNumbers(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return rec_dfs_sum(root, 0, 0);
    }

    public int rec_dfs_sum(TreeNode node, int currSum, int result_sum) {

        if(node == null) {
            return result_sum;
        }

        currSum = (currSum * 10) + node.val;

        if(node.left == null && node.right == null) {
            result_sum += currSum;
            return result_sum;
        }

        return  rec_dfs_sum(node.left, currSum, result_sum ) 
                + rec_dfs_sum(node.right, currSum, result_sum);


    }
}
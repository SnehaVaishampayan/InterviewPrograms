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
        
        // if(root == null) {
        //     return 0;
        // }
        return rec_dfs_sum(root, 0, 0);
    }

    public int rec_dfs_sum(TreeNode node, int curr_path_sum, int result_sum) {

        if(node == null) {
            return result_sum;
        }

        curr_path_sum = (curr_path_sum * 10) + node.val; // ????

        if(node.left == null && node.right == null) {
            System.out.println(" This path sum " + curr_path_sum);
            return result_sum + curr_path_sum;
        }

        return  rec_dfs_sum(node.left, curr_path_sum, result_sum ) 
                + rec_dfs_sum(node.right, curr_path_sum, result_sum);
    }
}
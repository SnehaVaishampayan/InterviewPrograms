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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subResult = new ArrayList<>();
        Queue<TreeNode> nextLevelQueue = new LinkedList<>();

        if(root == null) {
            return result;
        }

        nextLevelQueue.offer(root);
        nextLevelQueue.offer(null);

        while(!nextLevelQueue.isEmpty()) {
            // put left-right in queue 
            TreeNode currNode = nextLevelQueue.poll();
            if(currNode != null) {
                subResult.add(currNode.val);
                if(currNode.left != null) {
                    nextLevelQueue.offer(currNode.left);
                }
                if(currNode.right != null) {
                    nextLevelQueue.offer(currNode.right);
                }
            }
            else {
                List<Integer> subResult_copy = new ArrayList<>(subResult);
                result.add(subResult_copy);
                subResult.clear();
                if(!nextLevelQueue.isEmpty()) {
                    nextLevelQueue.offer(null);
                }
            }
        }
        return result;
        
    }
}
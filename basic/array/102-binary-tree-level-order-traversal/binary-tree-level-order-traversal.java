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
        List<Integer> subResultList = new ArrayList<>();
        Queue<TreeNode> nextLevelQueue = new LinkedList<>();

        if(root == null) {
            return result;
        }

        nextLevelQueue.offer(root);
        nextLevelQueue.offer(null);

        while(!nextLevelQueue.isEmpty()) {

            TreeNode currNode = nextLevelQueue.poll();
            //Process currNode  // here add to result 
            
            if(currNode!= null) {                            
                subResultList.add(currNode.val);                
                if(currNode.left!= null) {
                    nextLevelQueue.offer(currNode.left);
                }
                if(currNode.right != null) {
                    nextLevelQueue.offer(currNode.right);
                }
            }
            else {  // end of level
                List<Integer>  subResult_copy = new ArrayList<>(subResultList);
                result.add(subResult_copy);
                subResultList.clear();
                if(!nextLevelQueue.isEmpty()) {
                    nextLevelQueue.offer(null);
                }
            }
        } 
        return result;
    }
}
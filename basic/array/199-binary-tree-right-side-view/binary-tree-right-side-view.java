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

    int maxlevel = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result_level_right_side_view = new ArrayList<>();
        if(root == null) return result_level_right_side_view;
        List<Integer> eachLevel = new ArrayList<>();
        Queue<TreeNode> nextLevelQueue = new LinkedList<>();
        nextLevelQueue.offer(root);
        nextLevelQueue.offer(null);

        while(!nextLevelQueue.isEmpty()) {
            TreeNode currNode = nextLevelQueue.poll();
            if(currNode!= null) {
                eachLevel.add(currNode.val);
                if(currNode.left!= null)
                    nextLevelQueue.offer(currNode.left);
                if(currNode.right != null)
                    nextLevelQueue.offer(currNode.right);
            }
            else {                          // end of level
                result_level_right_side_view.add(eachLevel.get(eachLevel.size()-1));
                if(!nextLevelQueue.isEmpty()) {
                    nextLevelQueue.offer(null);
                }
            }
        }
        return result_level_right_side_view;
    }
    //     List<Integer> res = new ArrayList<>();  
    //     leftSideViewRecursive(root, res, 1);
    //     maxlevel = 0; 
    //     rightSideViewRecursive(root, res, 1);
    //     return res;
    // }
    
    // private void leftSideViewRecursive(TreeNode node, List<Integer> res, int level) {
    //     if(node == null){
    //         return ;
    //     }
        
    //     if(maxlevel <= level) {         // new level .. node in view
    //         res.add(node.val);
    //         maxlevel = level;
    //     }
    //     rightSideViewRecursive(node.left, res, level+1);
    // }

    // private void rightSideViewRecursive(TreeNode root, List<Integer> res, int level) {
    //     if(root == null){
    //         return ;
    //     }
        
    //     if(maxlevel <= level) {         // new level .. node in view
    //         res.add(root.val);
    //         maxlevel = level;
    //     }
    //     rightSideViewRecursive(root.right, res, level+1);
    // }
}
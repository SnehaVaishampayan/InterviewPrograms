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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null) {
            return null;
        }
        List<Integer> eachLevel = new ArrayList<>();
        Queue<TreeNode> nextLevelQueue = new LinkedList<>();

        nextLevelQueue.offer(root);
        nextLevelQueue.offer(null);

        while(!nextLevelQueue.isEmpty()) {
            TreeNode currNode = nextLevelQueue.poll();
            if(currNode != null) {
                // Process 
                eachLevel.add(currNode.val);
                if(currNode.left != null) {
                    nextLevelQueue.offer(currNode.left);
                }
                if(currNode.right != null) {
                    nextLevelQueue.offer(currNode.right);
                }
            }
            else {
                result.add(getAverage(eachLevel));
                eachLevel.clear();
                if(!nextLevelQueue.isEmpty()) {
                    nextLevelQueue.offer(null);
                }
            }
        }
        return result;
    //     List<Double> result = new ArrayList<>();
    //     if (root == null) return result;

    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.offer(root);
    //     while (!queue.isEmpty()) {

    //         double sum = 0;
    //         int n = queue.size();
    //         for (int i = 0; i < n; i++) {
    //             TreeNode node = queue.poll();
    //             sum += node.val;
    //             if (node.left != null) queue.offer(node.left);
    //             if (node.right != null) queue.offer(node.right);
    //         }
    //         result.add(sum / n);
    //     }

    //     return result;
    }
  
    private double getAverage(List<Integer> level) {
        
        double sum = 0;
        for(long i: level) {
            System.out.println("i " + i);
            sum += i;
        }
        System.out.println("sum " + sum);
        return (double) sum/level.size();
    }
}
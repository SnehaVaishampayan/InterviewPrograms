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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        List<Integer> eachLevelList = new ArrayList<>();
        Queue<TreeNode> nextLevelQueue = new LinkedList<>();

        nextLevelQueue.offer(root);
        nextLevelQueue.offer(null);
        int levelCount = 1;
        while(!nextLevelQueue.isEmpty()) {
            TreeNode currNode = nextLevelQueue.poll();
            System.out.println("while " );  
            if(currNode != null) {
                eachLevelList.add(currNode.val);
                if(currNode.left != null)
                    nextLevelQueue.offer(currNode.left);
                if(currNode.right != null) 
                    nextLevelQueue.offer(currNode.right);
            }
            else {
                System.out.println("else ");                                // end of level
                List<Integer> subResult;
                if(levelCount%2 == 0) 
                    subResult = reverseList(eachLevelList);
                else 
                    subResult = new ArrayList<>(eachLevelList);
                levelCount++;
                result.add(subResult);
                eachLevelList.clear();

                if(!nextLevelQueue.isEmpty()) 
                    nextLevelQueue.offer(null);
            }
        }
        return result;
    }

    private List<Integer> reverseList(List<Integer> eachLevelList) {
        List<Integer> resList = new ArrayList<>();
        int start = eachLevelList.size()-1;
        while(start >= 0) {
            resList.add(eachLevelList.get(start));
            start--;
        }
        return resList;
    }
}
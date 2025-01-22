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
    private int preorderIndex;
    private Map<Integer, Integer> inorderMap = new HashMap<>();
    int[] inorder; int[] postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.preorderIndex  = postorder.length - 1;
        this.inorder = inorder;
        // this.postorder = postorder;

        // populate hashmap for efficient look up
        for(int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return constructTree(postorder, 0, postorder.length - 1);
    }

    public TreeNode constructTree(int[] postorder, int start, int end) {
        if(start > end) {
            return null;
        }

        TreeNode newNode = new TreeNode(postorder[this.preorderIndex]);
        this.preorderIndex--;

        // get index of newNode val in inorder
        int newNodeInorderIndex = inorderMap.get(newNode.val);

        // build left and right subtree
       
        newNode.right = constructTree(postorder, newNodeInorderIndex + 1, end);
        newNode.left = constructTree(postorder, start, newNodeInorderIndex - 1);
        return newNode;
    
    }
}
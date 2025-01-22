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

    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // populate hashmap for efficient look up
        for(int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return constructTree(preorder, 0, preorder.length - 1);
    }

    public TreeNode constructTree(int[] preorder, int start, int end) {
        if(start > end) {
            return null;
        }

        TreeNode newNode = new TreeNode(preorder[preorderIndex]);
        preorderIndex++;

        // get index of newNode val in inorder
        int newNodeInorderIndex = inorderMap.get(newNode.val);

        // build left and right subtree
        newNode.left = constructTree(preorder, start, newNodeInorderIndex - 1);
        newNode.right = constructTree(preorder, newNodeInorderIndex + 1, end);
        return newNode;
    }
}
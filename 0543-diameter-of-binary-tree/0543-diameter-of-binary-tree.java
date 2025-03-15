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
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if (root == null) {
            return 0;
        }

        // Get the height of the left and right subtrees
        int lh = height(root.left);
        int rh = height(root.right);

        // The diameter through the current root
        int rootDai = lh + rh;

        // Recurse to find the maximum diameter in the left and right subtrees
        int leftDai = diameterOfBinaryTree(root.left);
        int rightDai = diameterOfBinaryTree(root.right);

        // Return the maximum of the three values
        return Math.max(Math.max(leftDai, rightDai), rootDai);
    }

    // Helper method to calculate the height of a subtree
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));

    }
}
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
    public boolean helper(TreeNode r1, TreeNode r2)
    {
         Boolean b1 = false;
         Boolean b2 = false;
        if(r1== null || r2== null)
        {
            return r1==r2;
        }
        if(r1.val == r2.val)
        {
            b1 = helper(r1.left, r2.right);
             b2 = helper(r1.right, r2.left);
        }
        return b1 && b2;
        
    }
    public boolean isSymmetric(TreeNode root) 
    {
        return helper(root.left, root.right);
    }
}
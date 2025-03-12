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
    ArrayList<Integer> al = new ArrayList<>();
    public void helper(TreeNode root)
    {
        if(root == null)
        {
            return ;
        }
        helper(root.left);
        
        al.add(root.val);
        helper(root.right);

    }
    public int kthSmallest(TreeNode root, int k) 
    {
        helper(root);
        int no = al.get(k-1);
        return no;
    }
}
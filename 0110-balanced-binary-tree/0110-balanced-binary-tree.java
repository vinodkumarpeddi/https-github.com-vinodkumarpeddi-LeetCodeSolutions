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
    private static int dfsheight(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lf=dfsheight(root.left);
        if(lf==-1) return -1;
        int rf=dfsheight(root.right);
        if(rf==-1) return -1;
        if(Math.abs(lf-rf)>1) return -1;
        return Math.max(lf,rf)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root)!=-1;
    }
}
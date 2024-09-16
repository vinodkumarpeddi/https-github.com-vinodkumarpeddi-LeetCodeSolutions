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
    private int maxdiameter=0;
    private int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lf=height(root.left);
        int rf=height(root.right);
        maxdiameter=Math.max(maxdiameter,(lf+rf));
        return 1+Math.max(lf,rf);
    }
    public int diameterOfBinaryTree(TreeNode root) {
         height(root);
         return maxdiameter;
          

    }
}
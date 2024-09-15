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
    private static void inorder(TreeNode node,List<Integer> ls)
    {
        if(node==null)
        {
            return;
        }
        ls.add(node.val);
        inorder(node.left,ls);
        inorder(node.right,ls);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        inorder(root,ls);
        return ls;
        
    }
}
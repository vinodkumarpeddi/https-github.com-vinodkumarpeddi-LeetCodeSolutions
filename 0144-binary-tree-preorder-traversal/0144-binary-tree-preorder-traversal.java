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
    private static void inorder(TreeNode root,List<Integer> ls)
    {
        Stack<TreeNode> st=new Stack<>();
        if(root!=null)
        {
            st.push(root);
        }
        while(!st.isEmpty())
        {
            TreeNode node=st.pop();
            if(node.right!=null){
                st.push(node.right);
            }
             if(node.left!=null){
                st.push(node.left);
            }
            ls.add(node.val);
            
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        inorder(root,ls);
        return ls;
    }
}
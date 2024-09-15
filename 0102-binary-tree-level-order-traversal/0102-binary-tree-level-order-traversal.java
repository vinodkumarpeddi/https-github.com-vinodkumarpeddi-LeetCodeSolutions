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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> ls=new ArrayList<>();
        if(root!=null)
        {
            queue.offer(root);
        }
        while(!queue.isEmpty())
        {
            int level=queue.size();
            List<Integer> sub =new ArrayList<>();
            for(int i=0;i<level;i++)
            {
                TreeNode node=queue.poll();
                sub.add(node.val);
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                 if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
            ls.add(sub);
        }
        return ls;
    }
}
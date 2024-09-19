class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ls = new ArrayList<>();
        if (root != null) {
            q.add(root);
        }
        boolean flag = false;  // This flag controls the zigzag behavior across levels
        
        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> sub = new ArrayList<>();
            
            for (int i = 0; i < level; i++) {
                TreeNode node = q.poll();
                sub.add(node.val);
                
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            
            // If flag is true, reverse the order of the sublist
            if (flag) {
                Collections.reverse(sub);
            }
            
            ls.add(sub);
            flag = !flag;  // Toggle flag for the next level
        }
        
        return ls;
    }
}

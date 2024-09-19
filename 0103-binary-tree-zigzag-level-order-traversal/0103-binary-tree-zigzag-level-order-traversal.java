class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ls = new ArrayList<>();
        if (root != null) {
            q.add(root);
        }
        boolean flag = true;  // This flag controls the zigzag behavior across levels
        
        while (!q.isEmpty()) {
            int level = q.size();
            LinkedList<Integer> sub = new LinkedList<>();  // Use LinkedList for easy addFirst()
            
            for (int i = 0; i < level; i++) {
                TreeNode node = q.poll();
                
                if (flag) {
                    sub.addLast(node.val);  // Add at the end for normal order
                } else {
                    sub.addFirst(node.val);  // Add at the beginning for reverse order
                }
                
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            
            ls.add(sub);
            flag = !flag;  // Toggle flag for the next level
        }
        
        return ls;
    }
}

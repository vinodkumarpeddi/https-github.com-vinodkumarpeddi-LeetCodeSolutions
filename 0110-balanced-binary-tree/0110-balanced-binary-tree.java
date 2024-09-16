class Solution {
    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lf = height(root.left);
        int rf = height(root.right);
        return 1 + Math.max(lf, rf);
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = isBalanced(root.left);
        if(left==false) return false;
        boolean right = isBalanced(root.right);
         if(right==false) return false;
        
        // Correcting the logic of diff
        boolean diff = Math.abs(height(root.left) - height(root.right)) <= 1;

        return left && right && diff;
    }
}

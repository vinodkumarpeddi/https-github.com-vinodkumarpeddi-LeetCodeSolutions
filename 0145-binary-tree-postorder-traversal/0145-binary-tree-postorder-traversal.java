class Solution {
    private static void postorder(TreeNode root, List<Integer> ls) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode node = root;

        // Early return for an empty tree
        if (node == null) return;

        stack1.push(node);
        while (!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();
            stack2.push(temp);

            if (temp.left != null) stack1.push(temp.left);
            if (temp.right != null) stack1.push(temp.right);
        }

        while (!stack2.isEmpty()) {
            ls.add(stack2.pop().val);
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }
}

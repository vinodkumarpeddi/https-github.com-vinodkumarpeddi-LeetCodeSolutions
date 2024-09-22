import java.util.*;

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
    class TreeCo {
        TreeNode node;
        int row;
        int col;
        public TreeCo(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // TreeMap to store nodes by column and rows (using List of Pair(row, val))
        Map<Integer, List<int[]>> map = new TreeMap<>();
        Queue<TreeCo> q = new LinkedList<>();
        q.offer(new TreeCo(root, 0, 0));

        while (!q.isEmpty()) {
            TreeCo curr = q.poll();
            TreeNode node = curr.node;
            int row = curr.row;
            int col = curr.col;

            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(new int[] { row, node.val });

            // Add left and right children to the queue
            if (node.left != null) {
                q.offer(new TreeCo(node.left, row + 1, col - 1));
            }
            if (node.right != null) {
                q.offer(new TreeCo(node.right, row + 1, col + 1));
            }
        }

        // Now sort the map values by row and value
        for (List<int[]> colList : map.values()) {
            // Sort by row first, and if row is the same, sort by value
            Collections.sort(colList, (a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1]; // Sort by value if row is the same
                } else {
                    return a[0] - b[0]; // Sort by row
                }
            });

            // Extract the node values in the correct order for the current column
            List<Integer> sortedColumn = new ArrayList<>();
            for (int[] pair : colList) {
                sortedColumn.add(pair[1]);
            }
            result.add(sortedColumn);
        }

        return result;
    }
}

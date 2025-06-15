import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> leftView = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (A == null) return leftView;

        queue.add(A);
        queue.add(null); // Level separator
        boolean isFirstNode = true;

        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();

            if (currNode == null) {
                if (queue.isEmpty()) break; // All levels processed
                queue.add(null); // Add separator for next level
                isFirstNode = true; // Reset for next level
                continue;
            }

            if (isFirstNode) {
                leftView.add(currNode.val); // First node of each level
                isFirstNode = false;
            }

            if (currNode.left != null) queue.add(currNode.left);
            if (currNode.right != null) queue.add(currNode.right);
        }

        return leftView;
    }

    public static void main(String[] args) {
        // Example usage:
        // Construct a sample tree:
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Solution sol = new Solution();
        ArrayList<Integer> leftViewResult = sol.solve(root);

        System.out.println("Left view of the tree: " + leftViewResult); // Expected: [1, 2, 4]

        // Another example: single node tree
        TreeNode singleNodeRoot = new TreeNode(10);
        ArrayList<Integer> singleNodeLeftView = sol.solve(singleNodeRoot);
        System.out.println("Left view of single node tree: " + singleNodeLeftView); // Expected: [10]

        // Example: null tree
        TreeNode nullRoot = null;
        ArrayList<Integer> nullLeftView = sol.solve(nullRoot);
        System.out.println("Left view of null tree: " + nullLeftView); // Expected: []
    }
}
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

public class Solution4 {
    public ArrayList<Integer> solve(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> leftview = new ArrayList<>();
        q.add(A);
        q.add(null);
        boolean isLeftView = false;
        while (!q.isEmpty()) {
            TreeNode currNode = q.poll();
            if (currNode == null) {
                if (q.isEmpty()) break;
                isLeftView = true;
                q.add(null);
                continue;
            }
            if (isLeftView) {
                leftview.add(currNode.val);
                isLeftView = false;
            }
            if (currNode.left!=null) {
                q.add(currNode.left);
            }
            if (currNode.right!=null) {
                q.add(currNode.right);
            }
        }
        return leftview;
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
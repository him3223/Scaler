import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Solution {

    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (A == null) return result;

        queue.add(A);
        queue.add(null);
        ArrayList<Integer> level = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();

            if (currNode == null) {
                result.add(level);
                if (queue.isEmpty()) break;
                level = new ArrayList<>();
                queue.add(null);
                continue;
            }

            level.add(currNode.val);

            if (currNode.left != null) queue.add(currNode.left);
            if (currNode.right != null) queue.add(currNode.right);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a sample binary tree:
        //         1
        //       /   \
        //      2     3
        //     / \   / \
        //    4   5 6   7

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        ArrayList<ArrayList<Integer>> result = sol.solve(root);

        // Print the result
        for (ArrayList<Integer> level : result) {
            System.out.println(level);
        }
    }
}

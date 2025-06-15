import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> rightview = new ArrayList<>();
        if (A == null) return rightview;

        q.add(A);
        q.add(null);
        boolean isLastNode = false;

        while (!q.isEmpty()) {
            TreeNode currNode = q.poll();

            if (currNode == null) {
                if (q.isEmpty()) break;
                q.add(null);
                isLastNode = true;
                continue;
            }

            if (isLastNode) {
                rightview.add(currNode.val);
                isLastNode = false;
            }

            if (currNode.right != null) q.add(currNode.right);
            if (currNode.left != null) q.add(currNode.left);
        }

        return rightview;
    }

    public static void main(String[] args) {
        // Construct binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        Solution sol = new Solution();
        ArrayList<Integer> rightView = sol.solve(root);

        // Print right view
        System.out.println("Right View of Binary Tree: " + rightView);
    }
}

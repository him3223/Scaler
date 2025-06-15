import java.util.*;

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
    int prev = Integer.MIN_VALUE;
    boolean ans = true;
    public int isValidBST(TreeNode A) {
        inOrder(A);
        if (ans) return 1;
        return 0;
    }
    public boolean inOrder(TreeNode A) {
        inOrder(A.left);
        if (A.val<=prev) {
            ans=false;
            return;
        }
        prev = A.val;
        inOrder(A.right);
    }
    public static void main(String[] args) {
        /*
            Construct the following BST:
                  5
                 / \
                3   7
               / \   \
              2   4   8
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);

        Solution sol = new Solution();
        int result = sol.isValidBST(root);

        System.out.println("Is the tree a valid BST? " + (result == 1 ? "Yes" : "No"));
    }
}

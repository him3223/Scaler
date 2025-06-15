/** Definition for binary tree node. */
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

/** Your original BST search logic. */
class Solution {
    public int solve(TreeNode A, int B) {
        TreeNode root = A;
        while (root!=null) {
            if (root.val == B) return 1;
            if (root.val < B) {
                root=root.right;
            }
            else root=root.left;
        }
        return 0;
    }
}

/** Main class to run the program with hardcoded tree and B=16 */
public class Main2 {
    public static void main(String[] args) {
        // Building the tree manually
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(12);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(14);
        root.left.left.left = new TreeNode(8);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(27);

        int B = 16; // value to search

        Solution sol = new Solution();
        int result = sol.solve(root, B);
        System.out.println(result); // Expected output: 1
    }
}

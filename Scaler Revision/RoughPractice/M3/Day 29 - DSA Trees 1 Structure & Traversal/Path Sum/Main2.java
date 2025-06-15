public class Main2 {
    public static void main(String[] args) {
        // Constructing the binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        Solution solution = new Solution();
        int result = solution.hasPathSum(root, targetSum);

        if (result == 1) {
            System.out.println("There exists a root-to-leaf path with the given sum.");
        } else {
            System.out.println("No root-to-leaf path exists with the given sum.");
        }
    }
}

class Solution {
    public int hasPathSum(TreeNode A, int B) {
        if (A==null) return 0;
        if (A.left == null && A.right==null) {
            return A.val==B ? 1:0;
        }
        int rem = B-A.val;
        if (hasPathSum(A.left, rem) == 1 || hasPathSum(A.right, rem) == 1) return 1;
        return 0;
    }
}

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

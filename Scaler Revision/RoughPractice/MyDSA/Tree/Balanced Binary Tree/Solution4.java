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
    public int isBalanced(TreeNode A) {
        if (balanced(A))
            return 1;
        return 0;
    }

    public boolean balanced(TreeNode A) {
        if (A == null)
            return true;  // Changed from false to true: a null tree is balanced
        int lh = height(A.left);
        int rh = height(A.right);
        if (Math.abs(lh - rh) > 1)
            return false;
        return (balanced(A.left) && balanced(A.right));
    }

    int height(TreeNode A) {
        if (A==null) return -1;
        return 1+Math.max(height(A.left),height(A.right));
    }

    public static void main(String[] args) {
        /*
            Example Tree:
                  1
                 / \
                2   3
               /
              4
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        Solution sol = new Solution();
        int result = sol.isBalanced(root);
        System.out.println("Is tree balanced? " + (result == 1 ? "Yes" : "No"));
        System.out.println("height: "+sol.height(root));
    }
}

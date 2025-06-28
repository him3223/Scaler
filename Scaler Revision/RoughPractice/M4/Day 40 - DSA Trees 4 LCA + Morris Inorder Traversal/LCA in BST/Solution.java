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
    public int solve(TreeNode A, int B, int C) {
        TreeNode currNode = A;
        while (currNode != null) {
            if (currNode.val < B && currNode.val < C) {
                currNode = currNode.right;
            } else if (currNode.val > B && currNode.val > C) {
                currNode = currNode.left;
            } else {
                return currNode.val;
            }
        }
        return -1;
    }

    // Sample main method for testing
    public static void main(String[] args) {
        /*
               20
              /  \
            10    30
           / \     \
          5  15    40
        */
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.right = new TreeNode(40);

        Solution sol = new Solution();
        int B = 5, C = 15;
        int lca = sol.solve(root, B, C);
        System.out.println("LCA of " + B + " and " + C + " is: " + lca); // Expected: 10
    }
}

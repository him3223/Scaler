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

public class Solution3 {
    int count;
    int ans;
    public int kthsmallest(TreeNode A, int B) {
        inorder(A,B);
        return ans;
    }
    public void inorder(TreeNode A, int B) {
        if (A==null) return;
        inorder(A.left, B);
        count++;
        if (count==B) {
            ans = A.val;
            return;
        }
        inorder(A.right,B);
    }

    public static void main(String[] args) {
        // Sample BST:
        //        5
        //       / \
        //      3   7
        //     / \   \
        //    2   4   8

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);

        Solution sol = new Solution();
        int k = 3;
        int result = sol.kthsmallest(root, k);
        System.out.println(k + "rd smallest element in BST is: " + result);
    }
}

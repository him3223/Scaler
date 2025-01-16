/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    int prev = Integer.MIN_VALUE;
    boolean ans = true;
    public int isValidBST(TreeNode A) {
        inorder(A);
        if (ans)
        return 1;
        return 0;
    }
    public void inorder(TreeNode A) {
        if (A==null)
            return;
        inorder(A.left);
        if (A.val<prev) {
            ans = false;
            return;
        }
        prev = A.val;
        inorder(A.right);
    }
}

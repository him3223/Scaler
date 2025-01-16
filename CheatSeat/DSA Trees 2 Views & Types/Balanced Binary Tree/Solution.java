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
    boolean isbal = true;
    public int isBalanced(TreeNode A) {
        height(A);
        if (isbal) return 1;
        return 0;
    }
    public int height(TreeNode A) {
        if (A==null) return -1;
        int leftheight = height(A.left);
        int righheight = height(A.right);
        if (Math.abs(leftheight-righheight) > 1) {
            isbal = false;
        }
        return Math.max(leftheight,righheight)+1;
    }
}

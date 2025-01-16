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
    public int hasPathSum(TreeNode A, int B) {
        if (A==null)
            return 0;
        if (A.left==null && A.right==null)
            return (A.val == B)? 1:0;
        int rem = B-A.val;
        if (hasPathSum(A.left,rem) == 1 || hasPathSum(A.right,rem) ==1)
            return 1;
        return 0;
    }
}

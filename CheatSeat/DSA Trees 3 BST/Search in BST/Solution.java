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
    public int solve(TreeNode A, int B) {
        TreeNode root = A;
        while (root!=null) {
            if (root.val==B)
                return 1;
            if (root.val>B)
                root = root.left;
            else
                root = root.right;
        }
        return 0;
    }
}

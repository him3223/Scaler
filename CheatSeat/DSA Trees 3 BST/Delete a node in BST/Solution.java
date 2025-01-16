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
    public TreeNode solve(TreeNode A, int B) {
        if (A==null)
            return A;
        if (A.val<B)
            A.right = solve(A.right,B);
        else if (A.val>B)
            A.left = solve(A.left,B);
        else {
            if (A.left==null && A.right == null)
                return null;
            else if (A.left==null || A.right == null) {
                if (A.right== null)
                    return A.left;
                return A.right;
            }
            else{
                TreeNode currnode = A.left;
                while(currnode.right!=null) {
                    currnode=currnode.right;
                }
                A.val = currnode.val;
                A.left=solve(A.left,A.val);
            }
        }
        return A;
    }
}

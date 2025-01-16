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
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        return toBST(A,0,A.length-1);
    }
    public TreeNode toBST(final int[] A, int start, int end) {
        if (start>end)
            return null;
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = toBST(A,start,mid-1);
        root.right = toBST(A,mid+1,end);
        return root;
    }
}

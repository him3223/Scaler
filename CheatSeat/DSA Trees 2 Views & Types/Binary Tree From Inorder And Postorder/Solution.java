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
    public TreeNode buildTree(int[] A, int[] B) {
        int len = A.length-1;
        return construct(A,B,0,len,0,len);
    }
    public TreeNode construct(int[] A, int[] B, int inorderstart, int inorderend, int poststart, int postend) {
        if (inorderstart>inorderend) return null;
        int element = B[postend];
        TreeNode root = new TreeNode(element);
        int posroot = 0;
        for (int a=inorderstart; a<=inorderend; a++) {
            if (A[a]==element) {
                posroot = a;
                break;
            }
        }
        int x=posroot+poststart-inorderstart-1;
        root.left=construct(A,B,inorderstart,posroot-1,poststart,x);
        root.right=construct(A,B,posroot+1,inorderend,x+1,postend-1);
        return root;
    }
}

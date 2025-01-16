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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        preorder(A,al);
        return al;
    }
    public void preorder(TreeNode root,ArrayList<Integer> al) {
        if (root ==null)
            return;
        al.add(root.val);
        preorder(root.left,al);
        preorder(root.right,al);
    }
}
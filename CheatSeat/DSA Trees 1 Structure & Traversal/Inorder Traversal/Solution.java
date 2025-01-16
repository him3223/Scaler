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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        inorder(A,al);
        return al;
    }
    public void inorder(TreeNode root, ArrayList al) {
        if (root==null)
            return;
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
    }
}

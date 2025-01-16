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
import java.util.Queue;
import java.util.LinkedList;
public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        TreeNode currNode = new TreeNode(-1);
        int qsize = 0;
        queue.add(A);
        while(!queue.isEmpty()) {
            qsize = queue.size();
            for (int a=0; a<qsize; a++) {
                currNode = queue.poll();
                if (a==0) {
                    ans.add(currNode.val);
                }
                if (currNode.left!=null)
                    queue.add(currNode.left);
                if (currNode.right!=null)
                    queue.add(currNode.right);
            }
        }
        return ans;
    }
}

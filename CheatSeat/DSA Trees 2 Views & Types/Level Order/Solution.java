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
import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> level = new ArrayList<Integer>();
        while(!queue.isEmpty()) {
            int qsize = queue.size();
            level = new ArrayList<Integer>();
            for(int a=0; a<qsize; a++) {
                TreeNode currNode = queue.poll();
                level.add(currNode.val);
                if(currNode.left!=null)
                    queue.add(currNode.left);
                if(currNode.right!=null)
                    queue.add(currNode.right);
            }
            result.add(level);
        }
        return result;
    }
}

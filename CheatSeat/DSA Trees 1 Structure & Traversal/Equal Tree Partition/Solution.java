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
    private boolean canPartition;
    private long totalSum;

    public int solve(TreeNode A) {
        canPartition = false;
        totalSum = calculateSum(A); // Calculate the total sum of the tree

        // If the total sum is odd, it cannot be divided into two equal parts
        if (totalSum % 2 != 0) return 0;

        checkPartition(A, totalSum / 2); // Check if a valid partition exists
        return canPartition ? 1 : 0;
    }

    // Helper method to calculate the total sum of the tree
    private long calculateSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + calculateSum(node.left) + calculateSum(node.right);
    }

    // Helper method to check for a valid partition
    private long checkPartition(TreeNode node, long target) {
        if (node == null) return 0;

        long subtreeSum = node.val + checkPartition(node.left, target) + checkPartition(node.right, target);

        // If the current subtree's sum equals the target, and it's not the entire tree
        if (subtreeSum == target && subtreeSum != totalSum) {
            canPartition = true;
        }

        return subtreeSum;
    }
}

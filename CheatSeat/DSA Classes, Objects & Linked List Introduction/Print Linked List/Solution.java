/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public void solve(ListNode A) {
        ListNode currNode = A;
        while (currNode!=null) {
            System.out.print(currNode.val+" ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}

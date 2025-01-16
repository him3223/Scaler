/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A, int B) {
        // Edge Case 1: If the list is empty
        if (A == null) {
            return null;
        }
        
        // Edge Case 2: If the node to delete is the head (B == 0)
        if (B == 0) {
            return A.next; // Return the new head
        }
        
        // Initialize pointers to traverse the list
        ListNode current = A;
        int index = 0;
        
        // Traverse to the node just before the B-th node
        while (current != null && index < B - 1) {
            current = current.next;
            index++;
        }
        
        // Edge Case 3: If B is out of bounds (list too short)
        if (current == null || current.next == null) {
            return A; // Return the original list
        }
        
        // Update the next pointer to skip the B-th node
        current.next = current.next.next;
        
        // Return the head of the modified list
        return A;
    }
}
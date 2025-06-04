/**
 * Definition for singly-linked list.
 */
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Solution3 {
    public int solve(ListNode A) {
        ListNode fast = A;
        ListNode slow = A;
        while (fast!=null && fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        // Create an instance of Solution and call solve
        Solution sol = new Solution();
        int middleValue = sol.solve(head);
        System.out.println("Middle node value: " + middleValue); // Output: 3
    }
}

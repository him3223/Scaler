/**
 * Definition for singly-linked list.
 */
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Solution2 {
    public int solve(ListNode A) {
        ListNode fast = A;
        ListNode slow = A;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(12);
        head.next = new ListNode(24);
        head.next.next = new ListNode(39);
        head.next.next.next = new ListNode(42);
        head.next.next.next.next = new ListNode(53);
        head.next.next.next.next.next = new ListNode(63);
        head.next.next.next.next.next.next = new ListNode(79);

        // Create an instance of Solution and call solve
        Solution sol = new Solution();
        int middleValue = sol.solve(head);
        System.out.println("Middle node value: " + middleValue); // Output: 3
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode current = A;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return A;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 3, 4, 5, 5};
        ListNode head = createList(values);

        System.out.print("Original list: ");
        printList(head);

        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(head);

        System.out.print("List after removing duplicates: ");
        printList(result);
    }
}

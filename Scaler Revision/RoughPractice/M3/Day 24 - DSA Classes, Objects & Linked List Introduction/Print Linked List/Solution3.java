class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution3 {
    public void solve(ListNode A) {
        ListNode temp = A;
        while (temp.next!=null) {
            System.out.print(temp.val+" ");
        }
        System.out.println();
    }

    // Helper method to create a linked list from an array
    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Example input
        int[] values = {10,11,16,22};

        // Create linked list
        ListNode head = createLinkedList(values);

        // Solve
        Solution sol = new Solution();
        sol.solve(head);
    }
}

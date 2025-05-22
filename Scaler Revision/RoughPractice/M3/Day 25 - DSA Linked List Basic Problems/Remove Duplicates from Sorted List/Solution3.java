class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution3 {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode currNode = A;
        while (currNode!=null && currNode.next!=null) {
            if (currNode.val==currNode.next.val) {
                currNode.next=currNode.next.next;
            }
            else currNode=currNode.next;
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
        int[] values = {2,2,5,6,6,7,10};
        ListNode head = createList(values);

        System.out.print("Original list: ");
        printList(head);

        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(head);

        System.out.print("List after removing duplicates: ");
        printList(result);
    }
}

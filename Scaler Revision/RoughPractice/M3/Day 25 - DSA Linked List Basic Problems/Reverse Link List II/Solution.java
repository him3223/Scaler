class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Solution {

    public ListNode reverseBetween(ListNode A, int B, int C) {
        if (A == null || B == C) return A;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = A;
        ListNode prevNode = dummyNode;

        // Move prevNode to the node just before position B
        for (int i = 1; i < B; i++) {
            prevNode = prevNode.next;
        }

        ListNode currNode = prevNode.next;
        ListNode nextNode = null;

        // Reverse the sublist from position B to C
        for (int i = 0; i < C - B; i++) {
            nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = prevNode.next;
            prevNode.next = nextNode;
        }

        return dummyNode.next;
    }

    // Helper to build a linked list from array
    public static ListNode buildList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode currNode = head;
        for (int i = 1; i < arr.length; i++) {
            currNode.next = new ListNode(arr[i]);
            currNode = currNode.next;
        }
        return head;
    }

    // Helper to print the linked list
    public static void printList(ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val);
            if (currNode.next != null) System.out.print(" -> ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] values = {1, 2, 3, 4, 5};
        ListNode head = buildList(values);

        System.out.println("Original List:");
        printList(head);

        int B = 2;
        int C = 4;

        ListNode updatedHead = solution.reverseBetween(head, B, C);

        System.out.println("List after reversing from position " + B + " to " + C + ":");
        printList(updatedHead);
    }
}

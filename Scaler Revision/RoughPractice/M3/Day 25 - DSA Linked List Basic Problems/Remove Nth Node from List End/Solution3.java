class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution3 {

    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode currNode = A;
        ListNode fast = currNode;
        ListNode slow = currNode;
        for (int a=0; a<B; a++) {
            if (fast.next!=null) {
                fast=fast.next;
            }
            else return A.next;
        }
        while (fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return currNode;
    }

    // Utility function to print list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Creating the linked list: 1->2->3->4->5
        ListNode head = new ListNode(10);
        head.next = new ListNode(21);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(47);
        head.next.next.next.next = new ListNode(45);

        System.out.println("Original list:");
        printList(head);

        Solution solution = new Solution();
        int B = 3;
        head = solution.removeNthFromEnd(head, B);

        System.out.println("List after removing " + B + "-th node from end:");
        printList(head);
    }
}

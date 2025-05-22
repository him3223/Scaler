// Node definition
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Main solution class
class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode currNode = A;
        ListNode prevNode = null;
        ListNode nextNode = null;
        while (currNode!=null) {
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        return prevNode;
    }
}

// Main class to test the code
public class Main2 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});

        // Print original list
        System.out.print("Original list: ");
        printLinkedList(head);

        // Reverse the list using Solution class
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        // Print reversed list
        System.out.print("Reversed list: ");
        printLinkedList(reversedHead);
    }

    // Helper method to create a linked list from an array
    private static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

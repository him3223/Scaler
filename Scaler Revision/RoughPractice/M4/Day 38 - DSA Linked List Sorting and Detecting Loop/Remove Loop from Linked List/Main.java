// Definition for singly-linked list.
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode solve(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode temp1 = A;
                ListNode temp2 = slow;

                while (temp1 != temp2) {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }

                ListNode lastNode = temp1;
                while (lastNode.next != temp1) {
                    lastNode = lastNode.next;
                }

                lastNode.next = null;
                return A;
            }
        }

        return A;
    }
}

public class Main {
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating nodes
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        Solution solution = new Solution();
        ListNode newHead = solution.solve(head);  // Removes the cycle

        // Print the list to verify
        System.out.println("Linked List after removing cycle:");
        printList(newHead);
    }
}

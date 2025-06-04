public class Main2 {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Solution class with the intersection method
    static class Solution {
        public ListNode getIntersectionNode(ListNode A, ListNode B) {
            if (A==null || B==null) return null;
            ListNode pointerA = A;
            ListNode pointerB = B;
            while (pointerA!=pointerB) {
                pointerA = (pointerA == null) ? B: pointerA.next;
                pointerB = (pointerB==null) ? A: pointerB.next;
            }
            return pointerA;
        }
    }

    // Helper method to print the list from a given node
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create intersecting linked lists:
        //
        // A: 1 -> 2 \
        //             -> 8 -> 10
        // B:     3  /

        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(10);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = intersect;

        ListNode headB = new ListNode(3);
        headB.next = intersect;

        Solution sol = new Solution();
        ListNode intersectionNode = sol.getIntersectionNode(headA, headB);

        System.out.println("List A:");
        printList(headA);
        System.out.println("List B:");
        printList(headB);

        if (intersectionNode != null) {
            // System.out.println("Intersection starts at node with value: " + intersectionNode.val);
            System.out.print("Nodes from intersection onward: ");
            printList(intersectionNode);  // print 8 -> 10
        } else {
            System.out.println("No intersection.");
        }
    }
}

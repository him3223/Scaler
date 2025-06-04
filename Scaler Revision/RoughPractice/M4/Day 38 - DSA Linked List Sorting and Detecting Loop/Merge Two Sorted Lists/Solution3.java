class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution3 {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode currNode1 = A;
        ListNode currNode2 = B;
        ListNode tempNode = new ListNode(-1);
        ListNode newNode = tempNode;

        while (currNode1!=null && currNode2!=null) {
            if (currNode1.val<currNode2.val) {
                tempNode.next=currNode1;
                currNode1=currNode1.next;
            }
            else {
                tempNode.next=currNode2;
                currNode2=currNode2.next;
            }
        }
        if (currNode1.next!=null) tempNode.next=currNode1;
        if (currNode2.next!=null) tempNode.next=currNode2;
        return newNode.next;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Create two sorted linked lists
        ListNode list1 = createList(new int[]{11,40,90});
        ListNode list2 = createList(new int[]{23,36,49});

        // Merge and print the result
        ListNode merged = sol.mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(merged);
    }
}

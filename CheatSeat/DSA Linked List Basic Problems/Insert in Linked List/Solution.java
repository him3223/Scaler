public class Solution {
public ListNode solve(ListNode A, int B, int C) {
    ListNode newNode = new ListNode(B);

    // If the list is empty or inserting at head
    if (A == null || C == 0) {
        newNode.next = A;
        return newNode;
    }

    ListNode current = A;
    int count = 0;

    // Traverse to the position just before C (C-1)
    while (current != null && count < C - 1) {
        current = current.next;
        count++;
    }

    // Insert the new node at the end if we reached null
    if (current == null) {
        ListNode tail = A;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
    } else {
        // Insert the new node between current and current.next
        newNode.next = current.next;
        current.next = newNode;
    }

    return A;
}

}
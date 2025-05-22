Node findMiddle(Node head) {
    Node fast = head, slow = head;
    while (fast!=null && fast.next!=null) {
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
}

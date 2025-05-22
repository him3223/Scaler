Node getNthFromEnd(Node head, int n) {
    Node fast = head, slow = head;
    for (int a=0; a<n; a++) {
        if (fast==null) return null;
        fast=fast.next;
    }
    while (fast!=null) {
        fast=fast.next;
        slow=slow.next;
    }
    return slow;
}

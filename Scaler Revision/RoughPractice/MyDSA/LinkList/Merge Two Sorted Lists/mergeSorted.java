Node mergeSorted(Node l1, Node l2) {
    Node dummy = new Node(-1);
    Node tail = dummy;

    while (l1 != null && l2 != null) {
        if (l1.data < l2.data) {
            tail.next = l1;
            l1 = l1.next;
        } else {
            tail.next = l2;
            l2 = l2.next;
        }
        tail = tail.next;
    }

    tail.next = (l1 != null) ? l1 : l2;

    return dummy.next;
}

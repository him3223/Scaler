Node deleteByValue(Node head, int value) {
    if (head == null) return null;
    if (head.data == value) return head.next;

    Node current = head;
    while (current.next != null && current.next.data != value) {
        current = current.next;
    }

    if (current.next != null) {
        current.next = current.next.next;
    }

    return head;
}

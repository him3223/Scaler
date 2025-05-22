Node getNthFromEnd(Node head, int n) {
    Node first = head, second = head;

    for (int i = 0; i < n; i++) {
        if (second == null) return null;
        second = second.next;
    }

    while (second != null) {
        first = first.next;
        second = second.next;
    }

    return first;
}

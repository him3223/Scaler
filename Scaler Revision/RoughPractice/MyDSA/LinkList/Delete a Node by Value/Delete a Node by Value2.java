Node deleteByValue(Node head, int value) {
    if (head==null ) return null;
    if (head.data == value) return head.next;
    Node currNode = head;
    while (currNode.next != null && currNode.next.data == value) {
        currNode=currNode.next;
    }
    if (currNode.next != null) {
        currNode.next=currNode.next.next;
    }
    return head;
}

Node insertAtEnd(Node head, int data) {
    Node newNode = new Node(data);
    if (head==null) return newNode;
    Node currNode = head;
    while (currNode!=null) {
        currNode=currNode.next;
    }
    currNode.next=newNode;
    return head;
}

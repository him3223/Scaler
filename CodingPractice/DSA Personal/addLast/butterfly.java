Node head;
public void addLast(String data) {
	Node newNode = new Node(data);
	if (head == null) {
		head = newNode;
		return;
	}
	Node currNode = head;
	while (currNode.next!=null) {
		currNode = currNode.next;
	}
	currNode.next=newNode;
}
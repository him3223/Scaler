Node head;
public void addlast(String data){
	Node newNode = new Node(data);
	if (head == null) {
		head = newNode;
		return;
	}
	Node currNode = null;
	while (currNode.next!=null) {
		currNode = currNode.next;
	}
	currNode.next = newNode;
}
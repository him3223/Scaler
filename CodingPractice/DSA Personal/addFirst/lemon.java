Node head;
public void addFrst(String data) {
	Node newNode = new Node(data);
	if (head == null) {
		head = newNode;
		return;
	}
	newNode.next = head;
	head = newNode;
}
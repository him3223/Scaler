Node head;
public void addFirst(char data) {
	Node newNode = newNode(data);
	if (head == null) {
		head = newNode;
		return;
	}
	newNode.next = head;
	head = newNode;
}
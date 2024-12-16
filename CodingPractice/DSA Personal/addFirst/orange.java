Node head;
public void addFirst(float data) {
	Node newNode = new Node(data) {
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode; 
	}
}
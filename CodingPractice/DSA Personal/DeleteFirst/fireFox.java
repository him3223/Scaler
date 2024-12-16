Node head;
public void deleteFirst() {
	if (head == null) {
		System.out.println("List is Empty");
		return;
	}
	head = head.next;
}
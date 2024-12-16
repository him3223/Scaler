Node head;
public void deleteFirst() {
	if (head == null) {
		System.out.println("List is empty");
		return;
	}
	head = head.next;
}
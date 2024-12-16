Node head;
public void deleteFirst() {
	if (head == null) {
		System.out.println("list is Empty");
		return;
	}
	head = head.next;
}
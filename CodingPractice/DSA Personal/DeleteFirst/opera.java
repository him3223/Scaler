Node head;
public void deleteFirst(){
	if (head == null) {
		System.out.println("list is empty");
		return;
	}
	head = head.next;
}
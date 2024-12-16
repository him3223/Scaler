Node head;
public void printList(){
	if (head == null) {
		System.out.println("List is empty");
		return;
	}
	Node currNode = head;
	while(currNode!=null) {
		System.out.println(currNode.data);
		currNode = currNode.next;
	}
	System.out.println("null");
}
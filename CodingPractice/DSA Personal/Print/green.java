Node head;
public void printList(){
	if (head == null) {
		System.out.println("List is empty");
		return;
	}
	Node currNode = head;
	while (currNode!=null) {
		System.out.print(currNode.darta+" ");
		currNode = currNode.next;
	}
	System.out.println("NULL");
}
Node head;
public void deleteNode(){ 
	if (head == null) {
		System.out.println("list is empty");
		return;
	}
	if (head.next==null) {
		head=null;
		return;
	}
	Node secLastNode = head;
	Node lastNode = head.next;
	while (lastNode.next!=null) {
		secLastNode = secLastNode.next;
		lastNode = lastNode.next;
	}
	secLastNode.next=null;
}
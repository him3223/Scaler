Node head;
public void deleteLast(){
	if (head==null) {
		System.out.println("LIST IS empty");
		return;
	}
	if (head.next == null) {
		head=null;
		return;
	}
	Node secLastNode = head;
	Node lastNode = head.next;
	while (lastNode.next!=null) {
		lastNode=lastNode.next;
		seclastNode=secLastNode.next;
	}
	secLastNode.next=null;
}
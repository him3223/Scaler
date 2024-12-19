if (head == null) {
	return head;
}
if (head.data == x) {
	head=head.next;
	return head;
}

Node currNode = head;
while (currNode.next!=null) {
	if (currNode.next.data == x) {
		currNode.next = currNode.next.next;
		return head;
	}
	currNode = currNode.next;
}
return head;
	

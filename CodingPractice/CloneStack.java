public class CloneStack {
	Node currNode = head;
	while (currNode!=null) {
		Node newNode = new Node(currNode.data);
		newNode.next = currNode.next;
		currNode.next = newNode;
		currNode = newNode.next;
	}
	Node tempNode = head;
	Node randNode = head;
	while (tempNode!=null) {
		if (randNode!=null) {
			randNode.randome= tempNode.randome.next;
			tempNode = tempNode.next.next;
			if (tempNode!=null) {
				randNode = randNode.next.next;
			}
		}
	}
	Node tempNode2 = head;
	Node randome2 = head.next;
	Node headrand = randome2;
	while (tempNode2 !=null) {
		tempNode2.next = randome2.next;
		if (randome2.next != null) {
			randome2.next = tempNode2.next.next;
		}
		tempNode2 = tempNode2.next;
		randome2 = randome2.next;
	}
	return headrand;
}
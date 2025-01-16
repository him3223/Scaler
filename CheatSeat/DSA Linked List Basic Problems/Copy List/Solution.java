/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        // Step 1: Interweaving the original list with the copied list
        RandomListNode currNode = head;
        while (currNode != null) {
            RandomListNode newNode = new RandomListNode(currNode.label);
            newNode.next = currNode.next;  // new node points to the next node of the current node
            currNode.next = newNode;       // current node points to the new node
            currNode = newNode.next;       // move to the next node in the original list
        }

        // Step 2: Copy the random pointers
        currNode = head;
        while (currNode != null) {
            if (currNode.random != null) {
                currNode.next.random = currNode.random.next;  // copy the random pointer to the new node
            }
            currNode = currNode.next.next;  // move to the next original node
        }

        // Step 3: Separate the copied list from the original list
        RandomListNode newHead = head.next;  // The copied list starts from the second node
        RandomListNode originalNode = head;
        RandomListNode copyNode = newHead;
        
        while (originalNode != null) {
            originalNode.next = originalNode.next.next;  // restore the next pointer of the original list
            if (copyNode.next != null) {
                copyNode.next = copyNode.next.next;  // move to the next copied node
            }
            originalNode = originalNode.next;
            copyNode = copyNode.next;
        }

        return newHead;  // return the head of the copied list
    }
}


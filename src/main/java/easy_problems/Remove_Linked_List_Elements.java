package easy_problems;
/**
 203. Remove Linked List Elements
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */

public class Remove_Linked_List_Elements {
 
	public ListNode removeElements(ListNode head, int val) {
		ListNode prev = new ListNode(0);
		prev.next = head;
		ListNode curr = prev;

		while (curr.next != null) {

			if (curr.next.val == val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}

		return prev.next;
	}

	public static void main(String[] args) {
	
		Remove_Linked_List_Elements elements =  new Remove_Linked_List_Elements();
		NewList l1 = new NewList();
		l1.addToTheLast(new ListNode(2));
		l1.addToTheLast(new ListNode(2));
		l1.addToTheLast(new ListNode(6));
		l1.addToTheLast(new ListNode(3));
		l1.addToTheLast(new ListNode(4));
		l1.addToTheLast(new ListNode(5));
		l1.addToTheLast(new ListNode(6));
		
		NewList l2 = new NewList();
		l2.addToTheLast(elements.removeElements(l1.head, 2));
		l2.printList();
	}
}

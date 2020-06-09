package easy_problems;

/**
 * 83. Remove Duplicates from Sorted List Given a sorted linked list, delete all
 * duplicates such that each element appear only once.
 * 
 * Example 1: Input: 1->1->2 Output: 1->2
 * 
 * Example 2: Input: 1->1->2->3->3 Output: 1->2->3
 */

public class Remove_Duplicates_from_Sorted_List {

	public ListNode deleteDuplicates(ListNode head) {

		ListNode temp = head;

		while (temp != null && temp.next != null) {
			if (temp.val == temp.next.val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}

		}
		return head;
	}

	public static void main(String[] args) {
		Remove_Duplicates_from_Sorted_List array = new Remove_Duplicates_from_Sorted_List();
		NewList l1 = new NewList();
		l1.addToTheLast(new ListNode(1));
		l1.addToTheLast(new ListNode(1));
		l1.addToTheLast(new ListNode(2));
		// l1.printList();

		NewList l2 = new NewList();
		l2.addToTheLast(array.deleteDuplicates(l1.head));
		l2.printList();

	}
}

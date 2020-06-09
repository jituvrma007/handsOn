package easy_problems;

/**
 * 
 * 21. Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
 * 
 */
public class Merge_Two_Sorted_Lists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode temp = new ListNode(-1);
		ListNode head = temp;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}

		if (l1 != null) {
			temp.next = l1;
		} else {
			temp.next = l2;
		}
		return head.next;
	}

	public static void main(String[] args) {
		Merge_Two_Sorted_Lists lists = new Merge_Two_Sorted_Lists();
		NewList l1 = new NewList();
		NewList l2 = new NewList();

		l1.addToTheLast(new ListNode(5));
		l1.addToTheLast(new ListNode(10));
		l1.addToTheLast(new ListNode(15));
		l1.addToTheLast(new ListNode(18));
		l1.addToTheLast(new ListNode(28));
		l1.printList();

		l2.addToTheLast(new ListNode(2));
		l2.addToTheLast(new ListNode(3));
		l2.addToTheLast(new ListNode(20));
		l2.addToTheLast(new ListNode(30));
		l2.addToTheLast(new ListNode(31));
		l2.addToTheLast(new ListNode(33));
		l2.addToTheLast(new ListNode(35));
		l2.printList();

		NewList l3 = new NewList();
		l3.addToTheLast(lists.mergeTwoLists(l1.head, l2.head));
		l3.printList();
/**
5 10 15 18 28  
2 3 20 30 31 33 35  
2 3 5 10 15 18 20 28 30 31 33 35  
 */
		
	}
}

package easy_problems;

public class NewList {

	ListNode head;

	public void printList() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println(" ");
	}

	public void addToTheLast(ListNode node) {
		if (head == null) {
			head = node;
		} else {
			ListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}
}

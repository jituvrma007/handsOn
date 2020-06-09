package easy_problems;

import java.util.HashSet;

/**
141. Linked List Cycle
Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to.
If pos is -1, then there is no cycle in the linked list. 

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.

Example 3:
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

Follow up:
Can you solve it using O(1) (i.e. constant) memory?
**/

public class Linked_List_Cycle {

    public boolean hasCycleUsingSet(ListNode head) {
      HashSet<ListNode> allNodes  = new HashSet<>();
      while(head != null) {
    	  if (allNodes.contains(head)) {
              return true;
          } else {
        	  allNodes.add(head);
          }
          head = head.next;
      }
    	return false;
    }

	public boolean hasCycleUsingTwoPointers(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && slow != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
    
    
	public static void main(String[] args) {
		Linked_List_Cycle cycle =  new Linked_List_Cycle();
		NewList l1 = new NewList();
		l1.addToTheLast(new ListNode(3));
		l1.addToTheLast(new ListNode(2));
		l1.addToTheLast(new ListNode(0));
		l1.addToTheLast(new ListNode(-4));
		l1.head.next.next.next.next = l1.head.next;
//		l1.printList();
		System.out.println(cycle.hasCycleUsingSet(l1.head)); //true
		System.out.println(cycle.hasCycleUsingTwoPointers(l1.head)); //true
	
		NewList l2 = new NewList();
		l2.addToTheLast(new ListNode(1));
//		l2.printList();
		System.out.println(cycle.hasCycleUsingSet(l2.head)); //false
		System.out.println(cycle.hasCycleUsingTwoPointers(l2.head)); //false
		
		NewList l3 = new NewList();
		l3.addToTheLast(new ListNode(1));
		l3.addToTheLast(new ListNode(2));
		l3.printList();
		System.out.println(cycle.hasCycleUsingSet(l3.head)); //false
		System.out.println(cycle.hasCycleUsingTwoPointers(l3.head)); //true


	}
	
}

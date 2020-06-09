package easy_problems;

import java.util.HashSet;
import java.util.Set;

/**
 160. Intersection of Two Linked Lists
Write a program to find the node at which the intersection of two singly linked lists begins.
For example, the following two linked lists:
begin to intersect at node c1.

Example 1:
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 

Example 2:
Input: intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Reference of the node with value = 2
Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [0,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
 

Example 3:
Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: null
Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.

Notes:
If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */


public class Intersection_of_Two_Linked_Lists {
	
	public ListNode getIntersectionNodeBruteForce(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}
		for (ListNode i = headA; i != null; i = i.next) {
			for (ListNode j = headB; j != null; j = j.next) {
				if (i == j) {
					return i;
				}
			}
		}
		return null;
	}
	
	
	public ListNode getIntersectionNodeUsingSet(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}

		Set<ListNode> allNodes = new HashSet<>();
		while (headA != null) {
			allNodes.add(headA);
			headA = headA.next;
		}

		while (headB != null) {
			if (allNodes.contains(headB))
				return headB;
			else
				allNodes.add(headB);
			headB = headB.next;
		}

		return null;
	}
	
	public ListNode getIntersectionNodeUsingPointerApproach(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}
		ListNode pa = headA;
		ListNode pb = headB;

		while (pa != pb) {

			if (pa == null)
				pa = headB;
			else
				pa = pa.next;

			if (pb == null)
				pb = headA;
			else
				pb = pb.next;
		}

		return pa;
	}

	public static void main(String[] args) {
		NewList headA = new NewList();
		headA.addToTheLast(new ListNode(4));
		headA.addToTheLast(new ListNode(1));
		headA.addToTheLast(new ListNode(8));
		headA.addToTheLast(new ListNode(4));
		headA.addToTheLast(new ListNode(5));
		//headA.printList();
		
		NewList headB = new NewList();
		headB.addToTheLast(new ListNode(5));
		headB.addToTheLast(new ListNode(0));
		headB.addToTheLast(new ListNode(1));
		
		headB.head.next.next.next = headA.head.next.next;
		//headB.printList();
		
		NewList headC = new NewList();
		Intersection_of_Two_Linked_Lists lists =  new Intersection_of_Two_Linked_Lists();
		headC.addToTheLast(lists.getIntersectionNodeUsingPointerApproach(headA.head, headB.head));
		headC.printList();
		
	}
	
/** Solution
Approach 1: Brute Force
For each node ai in list A, traverse the entire list B and check if any node in list B coincides with ai.

Complexity Analysis
Time complexity : O(mn)O(mn).
Space complexity : O(1)O(1).

Approach 2: Hash Table
Traverse list A and store the address / reference to each node in a hash set.
Then check every node bi in list B: if bi appears in the hash set, then bi is the intersection node.

Complexity Analysis
Time complexity : O(m+n)O(m+n).
Space complexity : O(m)O(m) or O(n)O(n).

Approach 3: Two Pointers
Maintain two pointers pApA and pBpB initialized at the head of A and B, respectively. Then let them both traverse through the lists, one node at a time.
When pApA reaches the end of a list, then redirect it to the head of B (yes, B, that's right.); similarly when pBpB reaches the end of a list, redirect it the head of A.
If at any point pApA meets pBpB, then pApA/pBpB is the intersection node.
To see why the above trick would work, consider the following two lists: A = {1,3,5,7,9,11} and B = {2,4,9,11}, which are intersected at node '9'.
Since B.length (=4) < A.length (=6), pBpB would reach the end of the merged list first, because pBpB traverses exactly 2 nodes less than pApA does.
By redirecting pBpB to head A, and pApA to head B, we now ask pBpB to travel exactly 2 more nodes than pApA would.
So in the second iteration, they are guaranteed to reach the intersection node at the same time.
If two lists have intersection, then their last nodes must be the same one. So when pApA/pBpB reaches the end of a list, record the last element of A/B respectively.
If the two last elements are not the same one, then the two lists have no intersections.

Complexity Analysis
Time complexity : O(m+n)O(m+n).
Space complexity : O(1)O(1). 
*/
	
}

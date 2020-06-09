package easy_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 107. Binary Tree Level Order Traversal II
Given a binary tree, return the bottom-up level order traversal of its nodes' values.
(ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */



public class Binary_Tree_Level_Order_Traversal_II {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode current = queue.remove();
				list.add(current.val);
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
			result.add(list);
		}
		Collections.reverse(result);
		return result;
	}
	
	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.setLeft(new TreeNode(9));
		root.setRight(new TreeNode(20));
		root.right.setLeft(new TreeNode(15));
		root.right.setRight(new TreeNode(7));
		
		Binary_Tree_Level_Order_Traversal_II ii = new Binary_Tree_Level_Order_Traversal_II();
		List<List<Integer>> output = ii.levelOrderBottom(root);
		System.out.println(output);
	}
}

package easy_problems;

/**
 
111. Minimum Depth of Binary Tree
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its minimum depth = 2.

*/

public class Minimum_Depth_of_Binary_Tree {

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		if (root.left == null)
			return minDepth(root.right) + 1;

		if (root.right == null)
			return minDepth(root.left) + 1;

		return Integer.min(minDepth(root.left), minDepth(root.right)) + 1;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2));
		root.setRight(new TreeNode(20));
		root.right.setLeft(new TreeNode(15));
		root.right.setRight(new TreeNode(7));		
		

		Minimum_Depth_of_Binary_Tree tree = new Minimum_Depth_of_Binary_Tree();
		System.out.println(tree.minDepth(root));
	}
}

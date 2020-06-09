package easy_problems;

/**
 110. Balanced Binary Tree
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

 

Example 1:

Given the following tree [3,9,20,null,null,15,7]:

    3
   / \
  9  20
    /  \
   15   7
Return true.

Example 2:

Given the following tree [1,2,2,3,3,null,null,4,4]:

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
Return false.
 */


public class Balanced_Binary_Tree {

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;

		int l = crossCheckHeight(root.left);
		int r = crossCheckHeight(root.right);

		if (isBalanced(root.left) && isBalanced(root.right) && (Math.abs(l - r) <= 1)) {
			return true;
		}

		return false;
	}

	public int crossCheckHeight(TreeNode root) {

		if (root == null)
			return 0;

		int l = crossCheckHeight(root.left);
		int r = crossCheckHeight(root.right);

		return 1 + Math.max(l, r);
	}
	
	public static void main(String[] args) {
		Tree t = new Tree();

		TreeNode root = new TreeNode(3);
		root.setLeft(new TreeNode(9));
		root.setRight(new TreeNode(20));
		root.right.setLeft(new TreeNode(15));
		root.right.setRight(new TreeNode(7));

		Balanced_Binary_Tree tree = new Balanced_Binary_Tree();
		System.out.println(tree.isBalanced(root));
		t.print(root);
	}
}

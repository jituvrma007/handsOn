package easy_problems;

/**
 112. Path Sum
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */

public class Path_Sum {

	public boolean hasPathSum(TreeNode root, int sum) {

		if (root == null)
			return false;
		if (root.val == sum && (root.left == null && root.right == null))
			return true;

		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

	}    
    
	
    public static void main(String[] args) {
		
    	TreeNode root = new TreeNode(5);
		root.setLeft(new TreeNode(4));
		root.left.setLeft(new TreeNode(11));
		root.left.left.setLeft(new TreeNode(7));
		root.left.left.setRight(new TreeNode(2));
		root.setRight(new TreeNode(8));
		root.right.setLeft(new TreeNode(13));
		root.right.setRight(new TreeNode(4));
		root.right.right.setRight(new TreeNode(1));
		    	
    	Path_Sum sum = new Path_Sum();
		System.out.println(sum.hasPathSum(root, 22));
		
		//Tree t = new Tree();
		//t.print(root);
		
	}
}

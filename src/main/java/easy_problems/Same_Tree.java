package easy_problems;
/**
100. Same Tree
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true

Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false

Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
  
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Same_Tree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null) { // if both of the tree is null then return true
			return true;
		} else if (p == null || q == null) { // if either of the tree is null then return false
			return false;
		} else if (p.val != q.val) { // if both the root of trees are not same then return true
			return false;
		} else {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // compare left of trees and right of the trees 
		}

	}
    
     public static void main(String[] args) {
    	Tree t = new Tree();
 	    	 
 		TreeNode q = new TreeNode(0); 
		q.setLeft(new TreeNode(1));
 		q.left.setLeft(new TreeNode(3));
 		q.left.setRight(new TreeNode(4));
 		q.left.left.setLeft(new TreeNode(7));
 		q.left.left.setRight(new TreeNode(8));
 		q.left.right.setLeft(new TreeNode(9));
 		q.left.right.setRight(new TreeNode(10));
 		q.setRight(new TreeNode(2));
 		q.right.setLeft(new TreeNode(5));
 		q.right.setRight(new TreeNode(6));
 		q.right.left.setLeft(new TreeNode(11));
 		q.right.left.setRight(new TreeNode(12));
 		q.right.right.setLeft(new TreeNode(13));
 		q.right.right.setRight(new TreeNode(14));
 		t.print(q);
 		 
 		
    	TreeNode p = new TreeNode(0);
 		p.setLeft(new TreeNode(1));
 		p.left.setLeft(new TreeNode(3));
 		p.left.setRight(new TreeNode(4));
 		p.left.left.setLeft(new TreeNode(7));
 		p.left.left.setRight(new TreeNode(8));
 		p.left.right.setLeft(new TreeNode(9));
 		p.left.right.setRight(new TreeNode(10));
 		p.setRight(new TreeNode(2));
 		p.right.setLeft(new TreeNode(5));
 		p.right.setRight(new TreeNode(6));
 		p.right.left.setLeft(new TreeNode(11));
 		p.right.left.setRight(new TreeNode(12));
 		p.right.right.setLeft(new TreeNode(13));
 		p.right.right.setRight(new TreeNode(14));
 		t.print(p);
 		
	 Same_Tree tree = new Same_Tree();
	 System.out.println(tree.isSameTree(p, q));
	}
}

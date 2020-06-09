package easy_problems;

/**
 104. Maximum Depth of Binary Tree
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 */
public class Maximum_Depth_of_Binary_Tree {

	
    public int maxDepth(TreeNode root) {
     
    	if(root == null) return 0;
    	
    	int leftHeight = maxDepth(root.left);
    	int rightHeight = maxDepth(root.right);
    	
    	return Integer.max(leftHeight+1, rightHeight+1); // return the maximum with adding 1
    }
    
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		root.setLeft(new TreeNode(9));
		root.setRight(new TreeNode(20));
		root.right.setLeft(new TreeNode(15));
		root.right.setRight(new TreeNode(7));		
		
		
	 Maximum_Depth_of_Binary_Tree tree = new Maximum_Depth_of_Binary_Tree();
	 System.out.println(tree.maxDepth(root));
	}
	
}

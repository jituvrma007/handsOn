package easy_problems;

/**
 101. Symmetric Tree
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
 

Follow up: Solve it both recursively and iteratively.
 */


public class Symmetric_Tree {
	
	public boolean isSymmetric(TreeNode root) {
		return checkMirror(root, root);

	}

	public boolean checkMirror(TreeNode p, TreeNode q) {

		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		} else {
			return  checkMirror(p.left, q.right) 
					&& checkMirror(p.right, q.left)
					&& (p.val == q.val);
		}

	}
    
    
	
	public static void main(String[] args) {
		Symmetric_Tree tree =  new Symmetric_Tree();

//		TreeNode root =  new TreeNode(1);
//		root.setLeft(new TreeNode(2));
//		root.left.setLeft(new TreeNode(3));
//		root.left.setRight(new TreeNode(3));
//		
//		root.setRight(new TreeNode(2));
//		root.right.setLeft(new TreeNode(4));
//		root.right.setRight(new TreeNode(3));
//		System.out.println(tree.isSymmetric(root));
		
//		TreeNode roo =  new TreeNode(1);
//		roo.setLeft(new TreeNode(2));
//		roo.left.setRight(new TreeNode(3));
//		
//		roo.setRight(new TreeNode(2));
//		roo.right.setRight(new TreeNode(3));
//		System.out.println(tree.isSymmetric(roo));

		TreeNode root =  new TreeNode(2);
		root.setLeft(new TreeNode(3));
		root.left.setLeft(new TreeNode(4));
		root.left.setRight(new TreeNode(5));
		
		root.setRight(new TreeNode(3));
		root.right.setLeft(null);
		root.right.setRight(new TreeNode(4));
		System.out.println(tree.isSymmetric(root));
		
		
	}
}

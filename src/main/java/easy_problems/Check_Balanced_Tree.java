package easy_problems;

/*Worng implementation, need to check it*/

public class Check_Balanced_Tree {

	public boolean isBalanced(TreeNode root) {

		if (root == null)
			return true;
		if (isBalanced(root.left) && isBalanced(root.right)) {
			return true;
		} else {
			return false;
		}

	}
	
	
	public static void main(String[] args) {
		
		Tree t = new Tree();

		TreeNode root = new TreeNode(3);
		root.setLeft(new TreeNode(9));
		root.setRight(new TreeNode(20));
		root.right.setLeft(new TreeNode(15));
	//	root.right.setRight(new TreeNode(7));
		t.print(root);
		 Check_Balanced_Tree tree = new Check_Balanced_Tree();
		 System.out.println(tree.isBalanced(root));
	}
	
}

package easy_problems;

public class Tree {

	private String traversePreOrder(TreeNode root) {
		if (root == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		sb.append(root.getVal());

		String pointerRight = "└──";
		String pointerLeft = (root.getRight() != null) ? "├──" : "└──";
		traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
		traverseNodes(sb, "", pointerRight, root.getRight(), false);
		return sb.toString();
	}

	private void traverseNodes(StringBuilder sb, String padding, String pointer, TreeNode node,
			boolean hasRightSibling) {
		if (node != null) {
			sb.append("\n");
			sb.append(padding);
			sb.append(pointer);
			sb.append(node.getVal());

			StringBuilder paddingBuilder = new StringBuilder(padding);
			if (hasRightSibling) {
				paddingBuilder.append("│  ");
			} else {
				paddingBuilder.append("   ");
			}

			String paddingForBoth = paddingBuilder.toString();
			String pointerRight = "└──";
			String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

			traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
			traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);
		}
	}

	public void print(TreeNode node) {
		System.out.println(traversePreOrder(node));
	}

//	public static void main(String[] args) {

//		Tree t = new Tree();
//		TreeNode root = new TreeNode(0);
//		
//		root.setLeft(new TreeNode(1));
//		root.left.setLeft(new TreeNode(3));
//		root.left.setRight(new TreeNode(4));
//		root.left.left.setLeft(new TreeNode(7));
//		root.left.left.setRight(new TreeNode(8));
//		root.left.right.setLeft(new TreeNode(9));
//		root.left.right.setRight(new TreeNode(10));
//		
//		root.setRight(new TreeNode(2));
//		root.right.setLeft(new TreeNode(5));
//		root.right.setRight(new TreeNode(6));
//		root.right.left.setLeft(new TreeNode(11));
//		root.right.left.setRight(new TreeNode(12));
//		root.right.right.setLeft(new TreeNode(13));
//		root.right.right.setRight(new TreeNode(14));
//		
//		t.print(root);
//
//	}
	
//	Tree t = new Tree();
//	TreeNode p = new TreeNode(0);
//		p.setLeft(new TreeNode(1));
//		p.left.setLeft(new TreeNode(3));
//		p.left.setRight(new TreeNode(4));
//		p.left.left.setLeft(new TreeNode(7));
//		p.left.left.setRight(new TreeNode(8));
//		p.left.right.setLeft(new TreeNode(9));
//		p.left.right.setRight(new TreeNode(10));
//		p.setRight(new TreeNode(2));
//		p.right.setLeft(new TreeNode(5));
//		p.right.setRight(new TreeNode(6));
//		p.right.left.setLeft(new TreeNode(11));
//		p.right.left.setRight(new TreeNode(12));
//		p.right.right.setLeft(new TreeNode(13));
//		p.right.right.setRight(new TreeNode(14));
//		t.print(p);
//	 
//		TreeNode q = new TreeNode(0); 
//	q.setLeft(new TreeNode(1));
//		q.left.setLeft(new TreeNode(3));
//		q.left.setRight(new TreeNode(4));
//		q.left.left.setLeft(new TreeNode(7));
//		q.left.left.setRight(new TreeNode(8));
//		q.left.right.setLeft(new TreeNode(9));
//		q.left.right.setRight(new TreeNode(10));
//		q.setRight(new TreeNode(2));
//		q.right.setLeft(new TreeNode(5));
//		q.right.setRight(new TreeNode(6));
//		q.right.left.setLeft(new TreeNode(11));
//		q.right.left.setRight(new TreeNode(12));
//		q.right.right.setLeft(new TreeNode(13));
//		q.right.right.setRight(new TreeNode(14));
//		t.print(q);
//}
}
